package tn.esprit.foyerspringboot.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Foyer {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

   @OneToMany (mappedBy = "foyer")
   private List <Bloc>blocs;




}

