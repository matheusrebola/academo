package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.EvolucaoAlunoCreateDto;
import academo.dtos.EvolucaoAlunoDto;
import academo.entities.EvolucaoAlunos;

@Component
public class EvolucaoAlunosMapper {
	private final ModelMapper modelMapper;
	
	public EvolucaoAlunos map(EvolucaoAlunoCreateDto dto) {
		EvolucaoAlunos evolucaoAlunos = modelMapper.map(dto, EvolucaoAlunos.class);
		return evolucaoAlunos;
	}
	
	public EvolucaoAlunoDto map(EvolucaoAlunos alunos) {
		EvolucaoAlunoDto dto = modelMapper.map(alunos, EvolucaoAlunoDto.class);
		return dto;
	}

}
