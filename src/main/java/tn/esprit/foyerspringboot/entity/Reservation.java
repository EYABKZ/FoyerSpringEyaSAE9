package tn.esprit.foyerspringboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
@Id
    private String idReservation;
    private DateFormat anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
   @JoinColumn(name = "chambre_id")
    private Chambre chambre;

   // @ManyToOne
   // @JoinColumn(name = "etudiant_id")
   // private Etudiant etudiant;
    // Getters et Setters

}
