package academo.dtos;

import java.util.UUID;

import academo.entities.LocalMedido;
import jakarta.validation.constraints.NotNull;

public record MedidasCorporaisDto(
		@NotNull UUID id,
		Float medida,
		LocalMedido localMedido) {

}
