package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entity.Etudiant;
import tn.esprit.foyerspringboot.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiants")
public class EtudiantController {

    private final IEtudiantService etudiantService;

    // Endpoint to retrieve all students
    // http://localhost:8089/tpFoyer/etudiants/retrieve-all-etudiants
    @GetMapping("/retrieve-all-etudiants")
    public List<Etudiant> getEtudiants() {
        List<Etudiant> listEtudiants = etudiantService.getAllEtudiants();
        return listEtudiants;
    }

    // Endpoint to add a new student
    // http://localhost:8089/tpFoyer/etudiants/add-etudiant
    @PostMapping("/add-etudiant")
    public ResponseEntity<Etudiant> addEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return new ResponseEntity<>(etudiant, HttpStatus.CREATED);
    }

    // Endpoint to delete a student by ID
    // http://localhost:8089/tpfoyer/etudiants/remove-etudiant/{etudiant-id}
    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void removeEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }

    // Endpoint to update a student
    // http://localhost:8089/tpFoyer/etudiants/modify-etudiant
    @PutMapping("/modify-etudiant")
    public Etudiant modifyEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }

    // Endpoint to retrieve a student by ID
    // http://localhost:8089/tpfoyer/etudiants/retrieve-etudiant/{etudiant-id}
    @GetMapping("/retrieve-etudiant/{etudiant-id}")
    public Etudiant retrieveEtudiant(@PathVariable("etudiant-id") Long idEtudiant) {
        Etudiant etudiant = etudiantService.findById(idEtudiant);
        return etudiant;
    }
}
