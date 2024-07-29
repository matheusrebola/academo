package academo.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import academo.entities.Alunos;
import academo.entities.MetodoPagamento;

public record PagamentosCreateDto(
		LocalDateTime dataPagamento,
		BigDecimal valor,
		MetodoPagamento metodoPagamento,
		Alunos aluno) {

}
