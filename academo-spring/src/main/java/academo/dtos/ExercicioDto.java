package academo.dtos;

import java.util.UUID;

import academo.entities.Aparelhos;
import academo.entities.Aulas;
import academo.entities.CategoriaExercicio;
import jakarta.validation.constraints.NotNull;

public record ExercicioDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		String videoUrl,
		CategoriaExercicio categoriaExercicio,
		Aulas aula,
		Aparelhos aparelho) {

}
