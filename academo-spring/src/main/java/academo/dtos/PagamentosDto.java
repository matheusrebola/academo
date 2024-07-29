package academo.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import academo.entities.Alunos;
import academo.entities.MetodoPagamento;
import jakarta.validation.constraints.NotNull;

public record PagamentosDto(
		@NotNull UUID id,
		LocalDateTime dataPagamento,
		BigDecimal valor,
		MetodoPagamento metodoPagamento,
		Alunos aluno) {

}
