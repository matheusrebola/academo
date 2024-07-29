package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Alunos;

public record AcessosCreateDto(
		LocalDateTime dataEntrada,
		LocalDateTime dataSaida,
		Alunos aluno) {

}
