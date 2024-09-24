package tn.esprit.foyerspringboot.entity;


import java.text.DateFormat;

public class Etudiant {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private DateFormat dateNaissance;

    // Getters et Setters
}
