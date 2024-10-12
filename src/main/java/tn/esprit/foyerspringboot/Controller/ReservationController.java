package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entity.Reservation;
import tn.esprit.foyerspringboot.services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService reservationService;

    // Endpoint to retrieve all reservations
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation> getReservations() {
        List<Reservation> listReservations = reservationService.getAllReservations();
        return listReservations;
    }

    // Endpoint to add a new reservation
    @PostMapping("/add-reservation")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return new ResponseEntity<>(reservation, HttpStatus.CREATED);
    }

    // Endpoint to remove a reservation
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") String reservationId) {
        reservationService.deleteReservation(reservationId);
    }

    // Endpoint to modify a reservation
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.updateReservation(r);
        return reservation;
    }

    // Endpoint to retrieve a specific reservation
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") String idReservation) {
        Reservation reservation = reservationService.findById(idReservation);
        return reservation;
    }
}
