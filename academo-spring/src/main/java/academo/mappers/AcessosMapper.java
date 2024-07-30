package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.AcessosCreateDto;
import academo.dtos.AcessosDto;
import academo.entities.Acessos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AcessosMapper {
	private final ModelMapper modelMapper;
	
	public Acessos map(AcessosCreateDto dto) {
		Acessos acesso = modelMapper.map(dto, Acessos.class);
		return acesso;
	}
	
	public AcessosDto map(Acessos acesso) {
		AcessosDto dto = modelMapper.map(acesso, AcessosDto.class);
		return dto;
	}

}
