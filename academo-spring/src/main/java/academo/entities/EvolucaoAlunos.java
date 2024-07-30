package academo.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record EvolucaoAlunos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		LocalDateTime dataRegistro,
		Float peso,
		Float altura,
		MedidasCorporais medidasCorporais,
		Desempenhos desempenho,
		Alunos aluno) {

}
