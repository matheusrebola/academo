package academo.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Pagamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataPagamento,
		BigDecimal valor,
		MetodoPagamento metodoPagamento,
		Alunos aluno) {

}
