package sk.samuel.projects.intergalacticempires.services;

import org.springframework.stereotype.Service;
import sk.samuel.projects.intergalacticempires.entities.Planet;
import sk.samuel.projects.intergalacticempires.exceptions.ResourceNotFoundException;
import sk.samuel.projects.intergalacticempires.repositories.PlanetRepository;

import java.util.List;

@Service
public class PlanetServiceImplementation implements PlanetService{
    PlanetRepository planetRepository;

    public PlanetServiceImplementation(PlanetRepository planetRepository){
        super();
        this.planetRepository = planetRepository;
    }


    @Override
    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    @Override
    public Planet savePlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    @Override
    public Planet getPlanetById(Long Id) {
        return planetRepository.findById(Id).orElse(null);
    }

    @Override
    public Planet updatePlanet(Long id, Planet planet) {
        return planetRepository.findById(id)
                .map(planet1 -> {
                    planet1.setName(planet.getName());
                    planet1.setPopulation(planet.getPopulation());
                    planet1.setTotalSpecies(planet.getTotalSpecies());
                    planet1.setEnergy(planet.getEnergy());
                    planet1.setAlloys(planet.getAlloys());
                    planet1.setMinerals(planet.getMinerals());
                    planet1.setResearch(planet.getResearch());
                    return planetRepository.save(planet1);
                }).orElseThrow(() -> new ResourceNotFoundException("Planet", "id", id));
    }

    @Override
    public void deletePlanet(Long id) {
        planetRepository.deleteById(id);
    }
}
