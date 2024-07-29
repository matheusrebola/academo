package academo.dtos;

import academo.entities.Alunos;
import academo.entities.Aulas;

public record ParticipacoesCreateDto(
		Alunos aluno,
		Aulas aula) {

}
