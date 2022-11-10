package ranking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ranking.model.Usuario;
import ranking.service.usuario.UsuarioService;

@SpringBootTest
public class UsuarioTeste {

    @Autowired
    private UsuarioService service;

    @Test
    public void criarUsuario(){
        Usuario user = new Usuario();

        user.setUsuario("Usuario");
        user.setSenha("12345678");

        service.salvar(user);
    }
}
