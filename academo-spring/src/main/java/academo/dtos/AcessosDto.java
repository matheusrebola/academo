package academo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Alunos;
import jakarta.validation.constraints.NotNull;

public record AcessosDto(
		@NotNull UUID id,
		LocalDateTime dataEntrada,
		LocalDateTime dataSaida,
		Alunos aluno) {

}
