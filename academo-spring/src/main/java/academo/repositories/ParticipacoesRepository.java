package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Participacoes;

public interface ParticipacoesRepository extends JpaRepository<Participacoes, UUID> {

}
