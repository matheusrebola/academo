package academo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Alunos;
import academo.entities.Desempenho;
import academo.entities.MedidasCorporais;
import jakarta.validation.constraints.NotNull;

public record EvolucaoAlunoDto(
		@NotNull UUID id,
		LocalDateTime dataRegistro,
		Float peso,
		Float altura,
		MedidasCorporais medidasCorporais,
		Desempenho desempenho,
		Alunos aluno) {

}
