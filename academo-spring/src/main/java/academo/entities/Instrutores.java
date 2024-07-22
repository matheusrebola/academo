package academo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public record Instrutores(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		@Email String email,
		String telefone,
		Especialidade especialidade) {

}
