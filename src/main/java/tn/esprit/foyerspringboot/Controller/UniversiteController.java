package tn.esprit.foyerspringboot.Controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyerspringboot.entity.Universite;
import tn.esprit.foyerspringboot.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    private final IUniversiteService universiteService;

    // Endpoint to retrieve all universities
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        List<Universite> listUniversites = universiteService.getAllUniversite();
        return listUniversites;
    }

    // Endpoint to add a new university
    @PostMapping("/add-universite")
    public ResponseEntity<Universite> addUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.addUniversite(u);
        return new ResponseEntity<>(universite, HttpStatus.CREATED);
    }

    // Endpoint to remove a university
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteService.deleteUniversite(universiteId);
    }

    // Endpoint to modify a university
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        Universite universite = universiteService.updateUniversite(u);
        return universite;
    }

    // Endpoint to retrieve a specific university
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long idUniversite) {
        Universite universite = universiteService.findById(idUniversite);
        return universite;
    }
}

