package Evento.controller;

import Evento.entity.Evento;
import Evento.repository.EventoRepository;
import Evento.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/eventos")
@RestController
public class EventoController {

    private EventoService eventoService;

    @Autowired
    public EventoController(EventoService eventoService){
        this.eventoService = eventoService;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Evento> salvar(@RequestBody Evento evento){
        eventoService.salvar(evento);
        return ResponseEntity.status(201).body(evento);

    }

    @RequestMapping("/all")
    public List<Evento> lista(){
        return  eventoService.listar();
    }

}
