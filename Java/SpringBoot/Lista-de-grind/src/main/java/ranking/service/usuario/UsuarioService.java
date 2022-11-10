package ranking.service.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ranking.model.Usuario;
import ranking.repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements UsuarioInterface {

    @Autowired
    private UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Usuario salvar(Usuario usuario) {
        if(usuario.getUsuario().isEmpty()){
            throw new RuntimeException("Usuario não encontrado!");
        }
       if(usuario.getSenha().length() < 8){
           throw new RuntimeException("Senha não pode ser menor do que 8 caracteres!");
       }else {
           return repository.save(usuario);
       }

    }

    @Override
    public Usuario alterar(Long id, Usuario usuario) {
        var user = repository.findById(id);
        if(user.isPresent()){
            usuario.setId(id);
            return repository.save(usuario);
        }else{
            throw new RuntimeException("Usuario não cadastrado!");
        }

    }

    @Override
    public void deletar(Long id) {
            if(repository.existsById(id)){
                repository.deleteById(id);
            }else {
                throw new RuntimeException("Usuario não encontrado! ");
            }
    }

    public Optional<Usuario> buscar(Long id){
        Optional<Usuario> user = buscarId(id);
        return user;
    }

    public Optional<Usuario> buscarPorUsuario(String usuario){
        Optional<Usuario> user1 = buscarPorNome(usuario);
        return user1;
    }

    private Optional<Usuario> buscarId(Long id){
        var user = repository.findById(id);
        user.orElseThrow(() ->{
            throw new RuntimeException("Usuario não encontrado");
        });
        return user;
    }

    private Optional<Usuario> buscarPorNome(String usuario){
        var user = repository.findByusuario(usuario);
        if(user == null){
            throw new RuntimeException("Usuario não encontrado!");
        }else{
            return Optional.of(user);
        }
    }


}
