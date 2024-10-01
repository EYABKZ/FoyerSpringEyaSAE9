package tn.esprit.foyerspringboot.entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Universite {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;
    @OneToOne
    private Foyer foyerU;

    // Getters et Setters

}
