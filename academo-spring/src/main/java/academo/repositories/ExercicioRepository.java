package academo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.Exercicios;

public interface ExercicioRepository extends JpaRepository<Exercicios, UUID> {

}
