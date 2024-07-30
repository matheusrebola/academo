package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.AparelhoCreateDto;
import academo.dtos.AparelhoDto;
import academo.entities.Aparelhos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AparelhosMapper {
	private final ModelMapper modelMapper;
	
	public Aparelhos map(AparelhoCreateDto dto) {
		Aparelhos aparelho = modelMapper.map(dto, Aparelhos.class);
		return aparelho;
	}
	
	public AparelhoDto map(Aparelhos aparelho) {
		AparelhoDto dto = modelMapper.map(aparelho, AparelhoDto.class);
		return dto;
	}

}
