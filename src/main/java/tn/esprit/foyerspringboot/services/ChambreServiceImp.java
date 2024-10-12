package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entity.Chambre;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImp implements IChambreService {
    ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);

    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();

    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    public Chambre findById(Long idChambre) {
        return null;
    }
}
