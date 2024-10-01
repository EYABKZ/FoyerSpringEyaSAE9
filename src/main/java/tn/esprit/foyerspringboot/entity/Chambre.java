package tn.esprit.foyerspringboot.entity;


import jakarta.persistence.*;
import lombok.*;

import java.nio.MappedByteBuffer;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
   @ManyToOne
    @JoinColumn (name = "bloc_id")
    private Bloc bloc;
@OneToMany (mappedBy = "chambre")
    public List<Reservation> reservations;
    // Getters et Setters
}
