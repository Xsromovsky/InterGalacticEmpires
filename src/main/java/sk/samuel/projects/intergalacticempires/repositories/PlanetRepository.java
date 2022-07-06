package sk.samuel.projects.intergalacticempires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.samuel.projects.intergalacticempires.entities.Planet;


public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
