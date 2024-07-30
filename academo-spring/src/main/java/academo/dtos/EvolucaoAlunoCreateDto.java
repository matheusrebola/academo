package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Alunos;
import academo.entities.Desempenhos;
import academo.entities.MedidasCorporais;

public record EvolucaoAlunoCreateDto(
		LocalDateTime dataRegistro,
		Float peso,
		Float altura,
		MedidasCorporais medidasCorporais,
		Desempenhos desempenho,
		Alunos aluno) {

}
