package academo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Desempenhos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Exercicios exercicio,
		Aparelhos aparelho,
		Alunos aluno,
		Integer repeticoes,
		LocalDateTime tempoGasto) {

}
