package academo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Alunos;
import academo.entities.Aparelhos;
import academo.entities.Exercicios;
import jakarta.validation.constraints.NotNull;

public record DesempenhoDto(
		@NotNull UUID id,
		Exercicios exercicio,
		Aparelhos aparelho,
		Alunos aluno,
		Integer repeticoes,
		LocalDateTime tempoGasto) {

}
