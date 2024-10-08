package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entity.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
