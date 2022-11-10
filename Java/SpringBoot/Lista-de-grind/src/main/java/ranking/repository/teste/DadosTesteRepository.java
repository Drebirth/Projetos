package ranking.repository.teste;


import org.springframework.data.jpa.repository.JpaRepository;
import ranking.model.teste.DadosTeste;

public interface DadosTesteRepository extends JpaRepository<DadosTeste, Long> {
}
