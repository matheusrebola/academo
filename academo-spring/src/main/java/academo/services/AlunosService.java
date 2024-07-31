package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Alunos;
import academo.repositories.AlunosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AlunosService {
	protected final AlunosRepository alunosRepository;
	
	public List<Alunos> getAll(){
		return alunosRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return alunosRepository.existsById(id);
	}
	
	public Alunos findById(UUID id) {
		return alunosRepository.findById(id).orElse(null);
	}
	
	public Alunos save(Alunos alunos) {
		return alunosRepository.save(alunos);
	}
	
	public void delete(Alunos alunos) {
		alunosRepository.delete(alunos);
	}
}
