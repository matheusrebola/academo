package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Alunos;
import academo.entities.Desempenho;
import academo.entities.MedidasCorporais;

public record EvolucaoAlunoCreateDto(
		LocalDateTime dataRegistro,
		Float peso,
		Float altura,
		MedidasCorporais medidasCorporais,
		Desempenho desempenho,
		Alunos aluno) {

}
