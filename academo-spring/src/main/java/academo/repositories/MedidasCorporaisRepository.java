package academo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import academo.entities.MedidasCorporais;

public interface MedidasCorporaisRepository extends JpaRepository<MedidasCorporais, UUID> {

}
