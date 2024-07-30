package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.MedidasCorporaisCreateDto;
import academo.dtos.MedidasCorporaisDto;
import academo.entities.MedidasCorporais;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MedidasCorporaisMapper {
	private final ModelMapper modelMapper;
	
	public MedidasCorporais map(MedidasCorporaisCreateDto dto) {
		MedidasCorporais medidasCorporais = modelMapper.map(dto, MedidasCorporais.class);
		return medidasCorporais;
	}
	
	public MedidasCorporaisDto map(MedidasCorporais medidasCorporais) {
		MedidasCorporaisDto dto = modelMapper.map(medidasCorporais, MedidasCorporaisDto.class);
		return dto;
	}
}
