package academo.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import academo.entities.Exercicios;
import academo.repositories.ExercicioRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExerciciosService {
	protected final ExercicioRepository exercicioRepository;
	
	public List<Exercicios> getAll(){
		return exercicioRepository.findAll();
	}
	
	public boolean exists(UUID id) {
		return exercicioRepository.existsById(id);
	}
	
	public Exercicios findById(UUID id) {
		return exercicioRepository.findById(id).orElse(null);
	}
	
	public Exercicios save(Exercicios exercicios) {
		return exercicioRepository.save(exercicios);
	}
	
	public void delete(Exercicios exercicios) {
		exercicioRepository.delete(exercicios);
	}
}
