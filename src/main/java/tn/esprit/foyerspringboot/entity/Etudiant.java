package tn.esprit.foyerspringboot.entity;


import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.List;

public class Etudiant {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private DateFormat dateNaissance;

@ManyToMany (mappedBy = "e")
List<Reservation> reservations;

    // Getters et Setters
}
