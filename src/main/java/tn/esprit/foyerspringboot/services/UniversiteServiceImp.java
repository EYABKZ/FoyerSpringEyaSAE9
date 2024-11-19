package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entity.Foyer;
import tn.esprit.foyerspringboot.entity.Universite;
import tn.esprit.foyerspringboot.repositories.FoyerRepository;
import tn.esprit.foyerspringboot.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {

    private final UniversiteRepository universiteRepository;
    private final FoyerRepository foyerRepository;
    private Object foyer;

    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }


    public void deleteUniversite(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }

    public List<Universite> getAllUniversites() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Long idUniversite) {

    }

    @Override
    public List<Universite> getAllUniversite() {
        return List.of();
    }

    @Override
    public Universite findById(Long idUniversite) {
        return null;
    }


    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite) {
        Universite universite = universiteRepository.findByNomUniversite(nomUniversite);
        if (universite == null) {
            throw new RuntimeException("Université " + nomUniversite + " non trouvée");
        }
        // Recherche du foyer par ID
        Foyer foyer = foyerRepository.findById(idFoyer).orElseThrow(() -> new RuntimeException("Foyer avec l'ID " + idFoyer + " non trouvé"));
        // Affectation du foyer à l'université
        universite.setFoyerU(foyer);
        // Sauvegarde de l'université avec le foyer affecté
        return universiteRepository.save(universite);
    }
    }

