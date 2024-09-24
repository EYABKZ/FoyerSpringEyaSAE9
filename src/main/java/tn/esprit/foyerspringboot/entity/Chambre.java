package tn.esprit.foyerspringboot.entity;


import jakarta.persistence.Enumerated;

public class Chambre {
    private Long idChambre;
    private Long numeroChambre;
   enum TypeChambre typeC;
    private Bloc bloc;
    @Enumerated(enumType.LONG)
    private TypeChambre typeC;

    // Getters et Setters
}
