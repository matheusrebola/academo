package academo.dtos;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record AlunoDto(
		@NotNull UUID id,
		String nome,
		String email,
		String telefone,
		LocalDate dataNascimento,
		String endereco) {

}
