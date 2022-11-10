package controller;

import entity.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.JogadorService;

@Controller
public class ControllerBDO {

    @Autowired
    private JogadorService js;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/salvar" , method = RequestMethod.POST)
    public Jogador salvar(@RequestBody Jogador j){
        js.salvar(j);
        return j;
    }
}
