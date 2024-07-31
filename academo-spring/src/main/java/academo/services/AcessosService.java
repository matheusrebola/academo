package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Acessos;
import academo.repositories.AcessosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AcessosService {
	protected final AcessosRepository acessosRepository;
	
	public List<Acessos> getAll(){
		return acessosRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return acessosRepository.existsById(id);
	}
	
	public Acessos findById(UUID id) {
		return acessosRepository.findById(id).orElse(null);
	}
	
	public Acessos save(Acessos acesso) {
		return acessosRepository.save(acesso);
	}
	
	public void delete(Acessos acessos) {
		acessosRepository.delete(acessos);
	}
}
