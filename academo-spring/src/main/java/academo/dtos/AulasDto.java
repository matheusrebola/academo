package academo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Instrutores;
import jakarta.validation.constraints.NotNull;

public record AulasDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		LocalDateTime datHora,
		LocalDateTime duracao,
		Integer capacidadeAlunos,
		Instrutores instrutor) {

}
