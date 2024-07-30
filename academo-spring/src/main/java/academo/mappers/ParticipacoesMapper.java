package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.ParticipacoesCreateDto;
import academo.dtos.ParticipacoesDto;
import academo.entities.Participacoes;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ParticipacoesMapper {
	private final ModelMapper modelMapper;
	
	public Participacoes map(ParticipacoesCreateDto dto) {
		Participacoes participacoes = modelMapper.map(dto, Participacoes.class);
		return participacoes;
	}
	
	public ParticipacoesDto map(Participacoes participacoes) {
		ParticipacoesDto dto = modelMapper.map(participacoes, ParticipacoesDto.class);
		return dto;
	}
}
