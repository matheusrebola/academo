package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.MedidasCorporais;
import academo.repositories.MedidasCorporaisRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MedidasCorporaisService {
	protected final MedidasCorporaisRepository medidasCorporaisRepository;
	
	public List<MedidasCorporais> getAll() {
		return medidasCorporaisRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return medidasCorporaisRepository.existsById(id);
	}
	
	public MedidasCorporais findById(UUID id) {
		return medidasCorporaisRepository.findById(id).orElse(null);
	}

	public MedidasCorporais save(MedidasCorporais medidasCorporais) {
		return medidasCorporaisRepository.save(medidasCorporais);
	}
	
	public void delete(MedidasCorporais medidasCorporais) {
		medidasCorporaisRepository.delete(medidasCorporais);
	}
}
