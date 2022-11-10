package Evento.service;

import Evento.entity.Evento;
import Evento.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EventoService {
    private EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventoRepository){
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> listar(){
        return eventoRepository.findAll();
    }


    public Evento salvar(Evento evento){
        var ev = evento;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        ev.setDataEHoraDeInicio(ev.getDataEHoraDeInicio());

   //     ev.setDataEHoraDeFim(ev.getDataEHoraDeFim(formatter));
        eventoRepository.save(ev);
        return ev;

    }

}
