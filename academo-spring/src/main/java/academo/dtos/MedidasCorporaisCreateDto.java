package academo.dtos;

import academo.entities.LocalMedido;

public record MedidasCorporaisCreateDto(
		Float medida,
		LocalMedido localMedido) {

}
