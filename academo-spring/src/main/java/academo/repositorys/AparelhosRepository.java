package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Aparelhos;

public interface AparelhosRepository extends JpaRepository<Aparelhos, UUID> {

}
