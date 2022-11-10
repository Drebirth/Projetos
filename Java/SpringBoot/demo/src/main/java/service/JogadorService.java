package service;

import entity.Jogador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.JogadorRepository;

import java.util.List;

@Service
public class JogadorService {
    private JogadorRepository jr;

    @Autowired
    public JogadorService(JogadorRepository jr){
        this.jr = jr;
    }

    public Jogador salvar(Jogador j){
        return jr.save(j);
    }

    public List<Jogador> jogadoresLista(){
        return jr.findAll();
    }


}
