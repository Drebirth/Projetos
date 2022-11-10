package ranking.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ranking.model.Usuario;
import ranking.service.usuario.UsuarioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("http://localhost:4200")
public class ControllerUsuario {

    @Autowired
    private UsuarioService service;

    public ControllerUsuario(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Usuario> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Usuario> encontrarUser(@PathVariable Long id){
        return service.buscar(id);
    }

    @GetMapping("/buscar/{usuario}")
    public Optional<Usuario> encontrar(@PathVariable String usuario){
        return service.buscarPorUsuario(usuario);
    }

    @PostMapping("/")
    public Usuario salvar(@RequestBody Usuario usuario){
        return service.salvar(usuario);
    }

    @PutMapping("/{id}")
    public Usuario alterar(@PathVariable Long id, @RequestBody Usuario usuario){
        return  service.alterar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }


}
