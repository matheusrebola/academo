package academo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Aparelhos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		LocalDateTime dataAquisicao,
		LocalDateTime dataManutencao,
		Aulas aula) {

}
