package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Instrutores;

public interface InstrutoresRepository extends JpaRepository<Instrutores, UUID> {

}
