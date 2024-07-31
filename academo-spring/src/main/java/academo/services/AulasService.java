package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Aulas;
import academo.repositories.AulasRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AulasService {
	protected final AulasRepository aulasRepository;
	
	public List<Aulas> getAll(){
		return aulasRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return aulasRepository.existsById(id);
	}
	
	public Aulas findById(UUID id) {
		return aulasRepository.findById(id).orElse(null);
	}
	
	public Aulas save(Aulas aulas) {
		return aulasRepository.save(aulas);
	}
	
	public void delete(Aulas aula) {
		aulasRepository.delete(aula);
	}
}
