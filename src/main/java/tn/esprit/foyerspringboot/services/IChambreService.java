package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Bloc;
import tn.esprit.foyerspringboot.entity.Chambre;
import tn.esprit.foyerspringboot.entity.TypeChambre;

import java.util.List;

   public interface IChambreService {
    Chambre addChambre(Chambre chambre);
    void deleteChambre(Long idChambre);



       List <Chambre> getAllChambre();
    Chambre updateChambre(Chambre chambre);
    Chambre findById(Long idChambre);


       Chambre getChambreById(Long id);

       List<Chambre> findAllByTypeC(TypeChambre tc);
       Chambre findByNumeroChambre(Long numeroChambre);
       List<Chambre> getChambreByBlocAndAndTypeC(Bloc bloc, TypeChambre typeC);

       List<Chambre> findByBlocListNomBloc(String nomBloc);

       Integer countByBlocListCapaciteBlocGreaterThan(Long capaciteLong);
       public Chambre affecterChambreABloc (int num, Integer idBloc);
       public void desaffecterChambreDeBloc (Long num, Integer idBloc);
   }