package academo.dtos;

import java.util.UUID;

import academo.entities.Especialidade;
import jakarta.validation.constraints.NotNull;

public record InstrutoresDto(
		@NotNull UUID id,
		String nome,
		String email,
		String telefone,
		Especialidade especialidade) {

}
