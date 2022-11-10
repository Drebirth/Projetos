package springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springmvc.model.Grind;

public interface GrindRepository extends JpaRepository<Grind, Long> {
}
