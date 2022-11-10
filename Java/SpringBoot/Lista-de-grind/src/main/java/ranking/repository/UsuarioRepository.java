package ranking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ranking.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByusuario(String usuario);
}
