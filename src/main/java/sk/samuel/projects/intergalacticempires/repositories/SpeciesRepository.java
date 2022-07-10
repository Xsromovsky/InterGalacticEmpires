package sk.samuel.projects.intergalacticempires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.samuel.projects.intergalacticempires.entities.Species;


@Repository
public interface SpeciesRepository extends JpaRepository<Species, Long> {
}
