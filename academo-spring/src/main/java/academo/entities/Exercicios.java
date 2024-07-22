package academo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Exercicios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		String videoUrl,
		CategoriaExercicio categoriaExercicio,
		Aulas aula,
		Aparelhos aparelho) {

}
