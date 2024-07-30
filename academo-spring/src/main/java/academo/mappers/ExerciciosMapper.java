package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.ExercicioCreateDto;
import academo.dtos.ExercicioDto;
import academo.entities.Exercicios;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ExerciciosMapper {
	private final ModelMapper modelMapper;
	
	public Exercicios map(ExercicioCreateDto dto) {
		Exercicios exercicio = modelMapper.map(dto, Exercicios.class);
		return exercicio;
	}
	
	public ExercicioDto map(Exercicios exercicios) {
		ExercicioDto dto = modelMapper.map(exercicios, ExercicioDto.class);
		return dto;
	}

}
