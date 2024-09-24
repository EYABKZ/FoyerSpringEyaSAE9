package tn.esprit.foyerspringboot.entity;


public class Foyer {
 //   @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

   // @ManyToOne
   // @JoinColumn(name = "universite_id")
    private Universite universite;

}

