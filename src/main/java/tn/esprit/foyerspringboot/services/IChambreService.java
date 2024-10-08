package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    void deleteChambre(long idChambre);
    List <Chambre> getAllChambre();
Chambre updateChambre(Chambre chambre);
}

