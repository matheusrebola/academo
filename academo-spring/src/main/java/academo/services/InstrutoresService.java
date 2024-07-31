package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Instrutores;
import academo.repositories.InstrutoresRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InstrutoresService {
	protected final InstrutoresRepository instrutoresRepository;
	
	public List<Instrutores> getAll(){
		return instrutoresRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return instrutoresRepository.existsById(id);
	}
	
	public Instrutores findById(UUID id) {
		return instrutoresRepository.findById(id).orElse(null);
	}
	
	public Instrutores save(Instrutores instrutores) {
		return instrutoresRepository.save(instrutores);
	}
	
	public void delete(Instrutores instrutores) {
		instrutoresRepository.delete(instrutores);
	}
}
