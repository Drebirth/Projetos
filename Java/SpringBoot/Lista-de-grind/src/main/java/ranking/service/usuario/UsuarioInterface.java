package ranking.service.usuario;


import ranking.model.Usuario;

import java.util.List;

public interface UsuarioInterface {

    List<Usuario> listarTodos();

    Usuario salvar(Usuario usuario);

    Usuario alterar(Long id, Usuario usuario);

    void deletar(Long id);

}
