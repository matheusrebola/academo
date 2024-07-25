package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Desempenho;

public interface DesempenhoRepository extends JpaRepository<Desempenho, UUID> {

}
