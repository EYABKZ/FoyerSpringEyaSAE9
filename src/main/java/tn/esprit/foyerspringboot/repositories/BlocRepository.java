package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entity.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
