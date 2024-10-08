package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entity.Universite;

public interface UniversiteRepository extends JpaRepository<Universite,Long>
{
}
