package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.DesempenhoCreateDto;
import academo.dtos.DesempenhoDto;
import academo.entities.Desempenhos;

@Component
public class DesempenhoMapper {
	private final ModelMapper modelMapper;
	
	public Desempenhos map(DesempenhoCreateDto dto) {
		Desempenhos desempenho = modelMapper.map(dto, Desempenhos.class);
		return desempenho;
	}
	
	public DesempenhoDto map(Desempenhos desempenhos) {
		DesempenhoDto dto = modelMapper.map(desempenhos, DesempenhoDto.class);
		return dto;
	}
}
