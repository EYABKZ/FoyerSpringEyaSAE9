package tn.esprit.foyerspringboot.services;

import tn.esprit.foyerspringboot.entity.Bloc;
import tn.esprit.foyerspringboot.entity.Chambre;

import java.util.List;

public interface IBlocService {
   Bloc addBloc(Bloc bloc);
   void deleteBloc(long bloc);
   Bloc updateBloc(Bloc bloc);
   List<Bloc> getAllBloc();


}
