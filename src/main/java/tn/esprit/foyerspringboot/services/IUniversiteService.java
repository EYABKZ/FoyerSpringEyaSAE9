package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void deleteUniversite(Long idUniversite);
    List<Universite> getAllUniversite();


    Universite findById(Long idUniversite);
}
