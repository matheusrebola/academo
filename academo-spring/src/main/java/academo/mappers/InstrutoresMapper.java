package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.InstrutoresCreateDto;
import academo.dtos.InstrutoresDto;
import academo.entities.Instrutores;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InstrutoresMapper {
	private final ModelMapper modelMapper;
	
	public Instrutores map(InstrutoresCreateDto dto) {
		Instrutores instrutores = modelMapper.map(dto, Instrutores.class);
		return instrutores;
	}
	
	public InstrutoresDto map(Instrutores instrutores) {
		InstrutoresDto dto = modelMapper.map(instrutores, InstrutoresDto.class);
		return dto;
	}

}
