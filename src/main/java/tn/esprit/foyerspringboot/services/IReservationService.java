package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(String idReservation);

    Reservation findById(String idReservation);
}
