package academo.dtos;

import java.util.UUID;

import academo.entities.Alunos;
import academo.entities.Aulas;
import jakarta.validation.constraints.NotNull;

public record ParticipacoesDto(
		@NotNull UUID id,
		Alunos aluno,
		Aulas aula) {

}
