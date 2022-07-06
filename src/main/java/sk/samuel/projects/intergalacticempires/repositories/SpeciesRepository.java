package sk.samuel.projects.intergalacticempires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.samuel.projects.intergalacticempires.entities.Species;

public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
