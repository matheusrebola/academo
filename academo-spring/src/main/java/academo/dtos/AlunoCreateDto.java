package academo.dtos;

import java.time.LocalDate;

public record AlunoCreateDto(
		String nome,
		String email,
		String telefone,
		LocalDate dataNascimento,
		String endereco) {

}
