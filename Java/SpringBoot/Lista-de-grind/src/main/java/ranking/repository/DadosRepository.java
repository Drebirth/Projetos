package ranking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ranking.model.Dados;

public interface DadosRepository extends JpaRepository<Dados, Long> {
}
