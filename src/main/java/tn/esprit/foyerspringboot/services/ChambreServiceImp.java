package tn.esprit.foyerspringboot.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyerspringboot.entity.Bloc;
import tn.esprit.foyerspringboot.entity.Chambre;
import tn.esprit.foyerspringboot.entity.TypeChambre;
import tn.esprit.foyerspringboot.repositories.BlocRepository;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;

import java.util.List;
@Service

public class ChambreServiceImp implements IChambreService {
    private final ChambreRepository chambreRepository;
    private final BlocRepository blocRepository;

    public ChambreServiceImp(ChambreRepository chambreRepository, BlocRepository blocRepository) {
        this.chambreRepository = chambreRepository;
        this.blocRepository = blocRepository;
    }

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);

    }

    @Override
    public void deleteChambre(Long idChambre) {
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
        return chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre getChambreById(Long id) {
        return chambreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Chambre> findAllByTypeC(TypeChambre tc) {
        return  chambreRepository.findAllByTypeC(tc);
    }

    @Override
    public Chambre findByNumeroChambre(Long numeroChambre) {
        return chambreRepository.findByNumeroChambre(numeroChambre);
    }

    @Override
    public List<Chambre> getChambreByBlocAndAndTypeC(Bloc b, TypeChambre typeC) {
        return chambreRepository.getChambreByBlocAndTypeC(b, typeC);
    }


    public List<Chambre> findByBlocListNomBloc(String nomBloc) {
        return chambreRepository.findByBlocList_NomBloc(nomBloc);
    }


    public Integer countByBlocListCapaciteBlocGreaterThan(Long capacite) {
        return chambreRepository.countByBlocList_CapaciteBlocGreaterThan(capacite);
    }

    @Override
    public Chambre affecterChambreABloc(int num, Integer idBloc) {
        return null;
    }

    public Chambre affecterChambreABloc(Long num, Integer idBloc) {
        Chambre chambre = chambreRepository.findById((long) num)
                .orElseThrow(() -> new RuntimeException("Chambre non trouvée avec l'ID : " + num));
        Bloc bloc = blocRepository.findById(Long.valueOf(idBloc))
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé avec l'ID : " + idBloc));

        chambre.setBloc(bloc);
        return chambreRepository.save(chambre);
    }
    public void desaffecterChambreDeBloc (Long num, Integer idBloc)
    {
    Chambre chambre = chambreRepository.findById(num)
            .orElseThrow(() -> new RuntimeException("Chambre non trouvée avec l'ID : " + num));
    Bloc bloc = blocRepository.findById(Long.valueOf(idBloc))
            .orElseThrow(() -> new RuntimeException("Bloc non trouvé avec l'ID : " + idBloc));
        if (chambre.getBloc() != null && chambre.getBloc().getIdBloc().equals(idBloc)) {
        chambre.setBloc(null);
        chambreRepository.save(chambre);
    } else {
        throw new RuntimeException("La chambre n'est pas associée au bloc avec l'ID : " + idBloc);
    }
}
}






