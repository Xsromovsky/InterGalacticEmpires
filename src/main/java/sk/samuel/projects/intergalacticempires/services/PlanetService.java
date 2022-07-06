package sk.samuel.projects.intergalacticempires.services;

import sk.samuel.projects.intergalacticempires.entities.Empire;
import sk.samuel.projects.intergalacticempires.entities.Planet;
import sk.samuel.projects.intergalacticempires.repositories.PlanetRepository;

import java.util.List;

public interface PlanetService {


    List<Planet> getAllPlanets();

    Planet savePlanet(Planet planet);
    Planet getPlanetById(Long Id);
    Planet updatePlanet(Long id, Planet planet);

    void deletePlanet(Long id);

}
