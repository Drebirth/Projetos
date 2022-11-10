package ranking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ranking.model.Dados;
import ranking.service.dados.DadosService;

import java.util.List;

@RestController
@RequestMapping("/dados")
@CrossOrigin("http://localhost:4200")
public class ControllerDados {

    @Autowired
    private DadosService service;

    public ControllerDados(DadosService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Dados> listar(){
        return service.listarTodos();
    }

    @PostMapping("/{id}")
    public Dados salvar(@PathVariable Long id,@RequestBody Dados dados){
        return service.salvar(id,dados);
    }

    @PutMapping("/{id}")
    public Dados alterar(@PathVariable Long id, @RequestBody Dados dados){
        return service.alterar(id,dados);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }


}
