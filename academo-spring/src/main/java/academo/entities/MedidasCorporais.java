package academo.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record MedidasCorporais(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		Float medida,
		LocalMedido localMedido) {

}
