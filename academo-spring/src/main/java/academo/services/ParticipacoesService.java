package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Participacoes;
import academo.repositories.ParticipacoesRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParticipacoesService {
	protected final ParticipacoesRepository participacoesRepository;
	
	public List<Participacoes> getAll() {
		return participacoesRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return participacoesRepository.exists(null);
	}
	
	public Participacoes findById(UUID id) {
		return participacoesRepository.findById(id).orElse(null);
	}
	
	public Participacoes save(Participacoes participacoes) {
		return participacoesRepository.save(participacoes);
	}
	
	public void delete(Participacoes participacoes) {
		participacoesRepository.delete(participacoes);
	}

}
