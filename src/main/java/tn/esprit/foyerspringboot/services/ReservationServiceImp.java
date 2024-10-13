package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entity.Reservation;
import tn.esprit.foyerspringboot.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImp implements IReservationService {
    ReservationRepository reservationRepository;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return List.of();
    }


    public void deleteReservation(long idReservation) {
        reservationRepository.deleteById(idReservation);
    }

    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {

    }

    @Override
    public Reservation findById(String idReservation) {
        return null;
    }

    public Reservation findById(Long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }
}
