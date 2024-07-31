package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Aparelhos;
import academo.repositories.AparelhosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AparelhosService {
	protected final AparelhosRepository aparelhosRepository;
	
	public List<Aparelhos> getAll() {
		return aparelhosRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return aparelhosRepository.existsById(id);
	}
	
	public Aparelhos findById(UUID id) {
		return aparelhosRepository.findById(id).orElse(null);
	}
	
	public Aparelhos save(Aparelhos aparelho) {
		return aparelhosRepository.save(aparelho);
	}
	
	public void delete(Aparelhos aparelho) {
		aparelhosRepository.delete(aparelho);
	}
}
