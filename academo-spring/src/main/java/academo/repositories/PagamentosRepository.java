package academo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Pagamentos;

public interface PagamentosRepository extends JpaRepository<Pagamentos, UUID> {

}
