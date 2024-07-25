package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Alunos;

public interface AlunosRepository extends JpaRepository<Alunos, UUID> {

}
