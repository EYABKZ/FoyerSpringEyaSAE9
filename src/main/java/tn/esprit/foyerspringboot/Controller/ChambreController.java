package tn.esprit.foyerspringboot.Controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entity.TypeChambre;
import tn.esprit.foyerspringboot.entity.Bloc;
import tn.esprit.foyerspringboot.entity.Chambre;
import tn.esprit.foyerspringboot.repositories.ChambreRepository;
import tn.esprit.foyerspringboot.services.ChambreServiceImp;
import tn.esprit.foyerspringboot.services.IChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreController {

    private final ChambreRepository chambreRepository;
    private final ChambreServiceImp chambreServiceImp;
    private IChambreService chambreService;


    @Operation(summary = "Add a new Chambre", description = "This endpoint adds a new chambre to the system.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Chambre added successfully"),
            @ApiResponse(responseCode = "400", description = "Invalid Chambre data provided")
    })
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }


    @GetMapping("/findAll")
    public List<Chambre> getAllChambres() {
        return chambreService.getAllChambre();
    }

    @GetMapping("/find/{id}")
    public Chambre getChambreById(@PathVariable Long id) {
        return chambreService.getChambreById(id);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }


    @DeleteMapping("/delete/{id}")
    public void deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
    }

    @GetMapping("/getAllChambreByTypeC")
    List<Chambre> findAllByTypeC(TypeChambre tc) {
        return chambreService.findAllByTypeC(tc);
    }


    @GetMapping("/retrieve-chambreByNumero/{chambre-id}")
    Chambre findByNumeroChambre(@PathVariable("chambre-id") Long numeroChambre) {
        return chambreService.findByNumeroChambre(numeroChambre);
    }

    @GetMapping("/getChambreByBlocAndTypeC")
    List<Chambre> getChambreByBlocAndAndTypeC(Bloc b, TypeChambre typeC) {
        return chambreService.getChambreByBlocAndAndTypeC(b, typeC);
    }

    @GetMapping("/findByBlocNom")
    public List<Chambre> findByBlocListNomBloc(@RequestParam String nomBloc) {
        return chambreService.findByBlocListNomBloc(nomBloc);
    }

    @GetMapping("/countByCapaciteGreaterThan")
    public Integer countByBlocListCapaciteBlocGreaterThan(@RequestParam("capacite") Long capacite) {
        return chambreService.countByBlocListCapaciteBlocGreaterThan(capacite);
    }
}