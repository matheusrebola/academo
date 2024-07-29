package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Alunos;
import academo.entities.Aparelhos;
import academo.entities.Exercicios;

public record DesempenhoCreateDto(
		Exercicios exercicio,
		Aparelhos aparelho,
		Alunos aluno,
		Integer repeticoes,
		LocalDateTime tempoGasto) {

}
