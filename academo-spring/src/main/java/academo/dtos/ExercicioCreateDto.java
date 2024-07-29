package academo.dtos;

import academo.entities.Aparelhos;
import academo.entities.Aulas;
import academo.entities.CategoriaExercicio;

public record ExercicioCreateDto(
		String nome,
		String descricao,
		String videoUrl,
		CategoriaExercicio categoriaExercicio,
		Aulas aula,
		Aparelhos aparelho) {

}
