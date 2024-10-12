package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant(Etudiant et);
    void deleteEtudiant(long idEtudiant);
    List<Etudiant> getAllEtudiants();
    Etudiant updateEtudiant(Etudiant et);


    Etudiant findById(Long idEtudiant);
}
