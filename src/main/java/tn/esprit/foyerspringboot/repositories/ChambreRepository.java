package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entity.Chambre;

public interface ChambreRepository  extends JpaRepository<Chambre,Long>
{

}

