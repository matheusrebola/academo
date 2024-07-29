package academo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Aulas;
import jakarta.validation.constraints.NotNull;

public record AparelhoDto(
		@NotNull UUID id,
		String nome,
		String descricao,
		LocalDateTime dataAquisicao,
		LocalDateTime dataManutencao,
		Aulas aula) {

}
