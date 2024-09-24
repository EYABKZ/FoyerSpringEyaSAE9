package tn.esprit.foyerspringboot.entity;

public class Bloc {
  //  @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    //@ManyToOne
  //  @JoinColumn(name = "foyer_id")
    private Foyer foyer;

}
