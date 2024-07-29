package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Instrutores;

public record AulasCreateDto(
		String nome,
		String descricao,
		LocalDateTime datHora,
		LocalDateTime duracao,
		Integer capacidadeAlunos,
		Instrutores instrutor) {

}
