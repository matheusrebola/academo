package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Desempenhos;
import academo.repositories.DesempenhoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DesempenhoService {
	protected final DesempenhoRepository desempenhoRepository;
	
	public List<Desempenhos> getAll() {
		return desempenhoRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return desempenhoRepository.existsById(id);
	}
	
	public Desempenhos findById(UUID id) {
		return desempenhoRepository.findById(id).orElse(null);
	}
	
	public Desempenhos save(Desempenhos desempenhos) {
		return desempenhoRepository.save(desempenhos);
	}
	
	public void delete(Desempenhos desempenhos) {
		desempenhoRepository.delete(desempenhos);
	}
}
