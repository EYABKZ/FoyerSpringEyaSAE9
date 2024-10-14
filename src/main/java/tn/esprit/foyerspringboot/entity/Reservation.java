package tn.esprit.foyerspringboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Reservation {
@Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;


 @ManyToMany
 List<Etudiant>e;}

