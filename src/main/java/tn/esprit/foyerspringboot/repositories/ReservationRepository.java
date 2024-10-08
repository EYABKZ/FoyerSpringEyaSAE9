package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.foyerspringboot.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
