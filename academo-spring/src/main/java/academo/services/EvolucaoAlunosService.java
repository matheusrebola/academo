package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.EvolucaoAlunos;
import academo.repositories.EvolucaoAlunosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EvolucaoAlunosService {
	protected final EvolucaoAlunosRepository evolucaoAlunosRepository;
	
	public List<EvolucaoAlunos> getAll() {
		return evolucaoAlunosRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return evolucaoAlunosRepository.existsById(id);
	}
	
	public EvolucaoAlunos findById(UUID id) {
		return evolucaoAlunosRepository.findById(id).orElse(null);
	}
	
	public EvolucaoAlunos save(EvolucaoAlunos evolucaoAlunos) {
		return evolucaoAlunosRepository.save(evolucaoAlunos);
	}
	
	public void delete(EvolucaoAlunos evolucaoAlunos) {
		evolucaoAlunosRepository.delete(evolucaoAlunos);
	}
}
