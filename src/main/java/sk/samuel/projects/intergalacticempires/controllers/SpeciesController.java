package sk.samuel.projects.intergalacticempires.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.samuel.projects.intergalacticempires.entities.Species;
import sk.samuel.projects.intergalacticempires.services.SpeciesService;

import java.util.List;

@RestController
@RequestMapping("/species")
public class SpeciesController {

    SpeciesService speciesService;

    public SpeciesController(SpeciesService speciesService){
        super();
        this.speciesService = speciesService;
    }

    //get all
    @GetMapping
    public List<Species> getAllSpecies(){
        return speciesService.getAllSpecies();
    }
    //create
    @PostMapping
    public ResponseEntity<Species> createNewSpecies(@RequestBody Species species){
        return new ResponseEntity<Species>(speciesService.saveSpecies(species), HttpStatus.CREATED);
    }
    //get by id
    @GetMapping("/{id}")
    public ResponseEntity<Species> getSpeciesById(@PathVariable("id") long id){
        return new ResponseEntity<Species>(speciesService.getSpeciesById(id), HttpStatus.OK);
    }

    //update by id
    @PutMapping("/{id}")
    public ResponseEntity<Species> updateSpecies(@PathVariable("id") Long id, @RequestBody Species species){
        return new ResponseEntity<Species>(speciesService.updateSpecies(id, species), HttpStatus.OK);
    }

    //delet by id
    @DeleteMapping("/{id}")
    public void deleteSpecies(@PathVariable("id") Long id){
        speciesService.deleteSpecies(id);
    }


}
