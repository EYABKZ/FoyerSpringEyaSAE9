package tn.esprit.foyerspringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.foyerspringboot.entity.Bloc;
import tn.esprit.foyerspringboot.entity.Chambre;
import tn.esprit.foyerspringboot.entity.TypeChambre;
import tn.esprit.foyerspringboot.entity.Reservation;

import java.util.Date;
import java.util.List;

public interface ChambreRepository  extends JpaRepository<Chambre,Long> {
    List<Chambre> findAllByTypeC(TypeChambre tc);
    Chambre findByNumeroChambre(Long numeroChambre);
    List<Chambre> getChambreByBlocAndTypeC(Bloc bloc, TypeChambre typeC);
    List<Chambre> findByBlocList_NomBloc(String nomBloc);
    Integer countByBlocList_CapaciteBlocGreaterThan(Long capaciteLong);


    @Query("SELECT c FROM Chambre c JOIN c.blocList b WHERE b.nomBloc = :nomBloc")
    List<Chambre> findByBlocNameQuery(@Param("nomBloc") String nomBloc);


   // @Query("SELECT c FROM Chambre c JOIN c.blocList b WHERE b.nomBloc = :nomBloc")
    //List<Chambre> findByBlocNameQuery(@Param("nomBloc") String nomBloc);

  //  @Query("SELECT c FROM Chambre c WHERE c.anneeDeRes BETWEEN :startDate AND :endDate")
    //List<Chambre> findByAnneeDeResQuery(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

}


