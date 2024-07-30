package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.AulasCreateDto;
import academo.dtos.AulasDto;
import academo.entities.Aulas;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AulasMapper {
	private final ModelMapper modelMapper;
	
	public Aulas map(AulasCreateDto dto) {
		Aulas aula = modelMapper.map(dto, Aulas.class);
		return aula;
	}
	
	public AulasDto map(Aulas aula) {
		AulasDto dto = modelMapper.map(aula, AulasDto.class);
		return dto;
	}
}
