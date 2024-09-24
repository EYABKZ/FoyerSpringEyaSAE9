package tn.esprit.foyerspringboot.entity;

import java.text.DateFormat;

public class Reservation {

    private String idReservation;
    private DateFormat anneeUniversitaire;
    private boolean estValide;

    //@ManyToOne
   // @JoinColumn(name = "etudiant_id")
    private Etudiant etudiant;

   // @ManyToOne
   // @JoinColumn(name = "chambre_id")
    private Chambre chambre;

}
