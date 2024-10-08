package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant et);
    void deleteEtudiant(long idEtudiant);
    List<Etudiant> getAllEtudiants();
    Void updateEtudiant(Etudiant et);


}
