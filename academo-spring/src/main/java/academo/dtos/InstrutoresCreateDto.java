package academo.dtos;

import academo.entities.Especialidade;

public record InstrutoresCreateDto(
		String nome,
		String email,
		String telefone,
		Especialidade especialidade) {

}
