package sk.samuel.projects.intergalacticempires.services;

import org.springframework.stereotype.Service;
import sk.samuel.projects.intergalacticempires.entities.Species;
import sk.samuel.projects.intergalacticempires.exceptions.ResourceNotFoundException;
import sk.samuel.projects.intergalacticempires.repositories.SpeciesRepository;

import java.util.List;

@Service
public class SpeciesServiceImplementation implements SpeciesService{

    SpeciesRepository speciesRepository;

    public SpeciesServiceImplementation(SpeciesRepository speciesRepository){
        super();
        this.speciesRepository = speciesRepository;
    }

    //get all species
    @Override
    public List<Species> getAllSpecies() {
        return speciesRepository.findAll();
    }
    // create a new species
    @Override
    public Species saveSpecies(Species species) {
        return speciesRepository.save(species);
    }
    // get by id
    @Override
    public Species getSpeciesById(Long Id) {
        return speciesRepository.findById(Id).orElse(null);
    }
    //update
    @Override
    public Species updateSpecies(Long id, Species species) {
        return speciesRepository.findById(id)
                .map(species1 -> {
                    species1.setSpecies(species.getSpecies());
                    species1.setTotalPopulationOfSpecies(species.getTotalPopulationOfSpecies());
                    return speciesRepository.save(species1);
                }).orElseThrow(() -> new ResourceNotFoundException("Species", "id", id));
    }
    //delete
    @Override
    public void deleteSpecies(Long id) {
        speciesRepository.deleteById(id);
    }
}
