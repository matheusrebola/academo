package academo.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import academo.dtos.AlunoCreateDto;
import academo.dtos.AlunoDto;
import academo.entities.Alunos;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AlunosMapper {
	private final ModelMapper modelMapper;
	
	public Alunos map(AlunoCreateDto dto) {
		Alunos aluno = modelMapper.map(dto, Alunos.class);
		return aluno;
	}
	
	public AlunoDto map(Alunos aluno) {
		AlunoDto dto = modelMapper.map(aluno, AlunoDto.class);
		return dto;
	}

}
