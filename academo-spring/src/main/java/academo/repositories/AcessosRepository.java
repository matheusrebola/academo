package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import academo.entities.Acessos;

@Repository
public interface AcessosRepository extends JpaRepository<Acessos, UUID> {

}
