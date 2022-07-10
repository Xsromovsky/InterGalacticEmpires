package sk.samuel.projects.intergalacticempires.services;


import sk.samuel.projects.intergalacticempires.entities.Species;

import java.util.List;

public interface SpeciesService {

    List<Species> getAllSpecies();

    Species saveSpecies(Species species);
    Species getSpeciesById(Long Id);
    Species updateSpecies(Long id, Species species);

    void deleteSpecies(Long id);

}
