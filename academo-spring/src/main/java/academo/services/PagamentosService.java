package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Pagamentos;
import academo.repositories.PagamentosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagamentosService {
	protected final PagamentosRepository pagamentosRepository;
	
	public List<Pagamentos> getAll() {
		return pagamentosRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return pagamentosRepository.existsById(id);
	}
	
	public Pagamentos findById(UUID id) {
		return pagamentosRepository.findById(id).orElse(null);
	}
	
	public Pagamentos save(Pagamentos pagamentos) {
		return pagamentosRepository.save(pagamentos);
	}
	
	public void delete(Pagamentos pagamentos) {
		pagamentosRepository.delete(pagamentos);
	}

}
