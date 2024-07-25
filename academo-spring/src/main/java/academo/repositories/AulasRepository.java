package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Aulas;

public interface AulasRepository extends JpaRepository<Aulas, UUID> {

}
