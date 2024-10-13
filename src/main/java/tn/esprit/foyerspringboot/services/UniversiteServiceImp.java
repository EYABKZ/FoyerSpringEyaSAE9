package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entity.Universite;
import tn.esprit.foyerspringboot.repositories.UniversiteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImp implements IUniversiteService {
    UniversiteRepository universiteRepository;

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
        return universiteRepository.findById(idUniversite).orElse(null);
    }
}
