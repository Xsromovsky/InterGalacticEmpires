package sk.samuel.projects.intergalacticempires.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.samuel.projects.intergalacticempires.entities.Planet;
import sk.samuel.projects.intergalacticempires.services.PlanetService;

import java.util.List;

@RestController
@RequestMapping("/planets")
public class PlanetController {

    private PlanetService planetService;

    public PlanetController(PlanetService planetService){
        super();
        this.planetService = planetService;
    }

    //get all planets
    @GetMapping
    public List<Planet> getAllPlanets(){
        return planetService.getAllPlanets();
    }

    //get planet by id
    @GetMapping("/{id}")
    public ResponseEntity<Planet> getPlanetById(@PathVariable("id") Long id){
        return new ResponseEntity<Planet>(planetService.getPlanetById(id), HttpStatus.OK);
    }

    //create planet
    @PostMapping
    public ResponseEntity<Planet> addNewPlanet(@RequestBody Planet planet){
        return new ResponseEntity<>(planetService.savePlanet(planet), HttpStatus.CREATED);
    }

    // update planet

    @PutMapping("/{id}")
    public ResponseEntity<Planet> updatePlanet(@PathVariable("id") Long id, @RequestBody Planet planet){
        return new ResponseEntity<Planet>(planetService.updatePlanet(id, planet), HttpStatus.OK);
    }

    //delete planet
    @DeleteMapping("/{id}")
    public void deletePlanet(@PathVariable("id") Long id){
        planetService.deletePlanet(id);
    }

}
