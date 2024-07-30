package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.PagamentosCreateDto;
import academo.dtos.PagamentosDto;
import academo.entities.Pagamentos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class PagamentosMapper {
	private final ModelMapper modelMapper;
	
	public Pagamentos map(PagamentosCreateDto dto) {
		Pagamentos pagamentos = modelMapper.map(dto, Pagamentos.class);
		return pagamentos;
	}
	
	public PagamentosDto map(Pagamentos pagamentos) {
		PagamentosDto dto = modelMapper.map(pagamentos, PagamentosDto.class);
		return dto;
	}
}
