package academo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Desempenhos;

public interface DesempenhoRepository extends JpaRepository<Desempenhos, UUID> {

}
