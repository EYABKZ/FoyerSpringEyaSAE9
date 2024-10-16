package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer(Foyer foyer);
    void deleteFoyer(long idFoyer);
    List<Foyer> getAllFoyers();
    Foyer updateFoyer(Foyer foyer);

    Foyer findById(Long idFoyer);
}
