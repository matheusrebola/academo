package academo.dtos;

import java.time.LocalDateTime;

import academo.entities.Aulas;

public record AparelhoCreateDto(
		String nome,
		String descricao,
		LocalDateTime dataAquisicao,
		LocalDateTime dataManutencao,
		Aulas aula) {

}
