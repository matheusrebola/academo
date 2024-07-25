package academo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.EvolucaoAlunos;

public interface EvolucaoAlunosRepository extends JpaRepository<EvolucaoAlunos, UUID> {

}
