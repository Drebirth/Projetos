package ranking.controller.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ranking.model.teste.DadosTeste;
import ranking.service.teste.DadosTesteService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teste")
@CrossOrigin("http://localhost:4200")
public class ControllerTeste {

    @Autowired
    private DadosTesteService service;

    public ControllerTeste(DadosTesteService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<DadosTeste> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Optional<DadosTeste> usuario(@PathVariable Long id){
        return service.encontrarUsuario(id);
    }

    @PostMapping("/")
    public DadosTeste salvar(@RequestBody DadosTeste dados){
        return service.adicionar(dados);
    }

    @PutMapping("/{id}")
    public DadosTeste alterar(@PathVariable Long id,@RequestBody DadosTeste dadosTeste){
        return service.alterar(id,dadosTeste);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
