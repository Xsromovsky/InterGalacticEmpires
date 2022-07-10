package sk.samuel.projects.intergalacticempires.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.samuel.projects.intergalacticempires.entities.Planet;

@Repository
public interface PlanetRepository extends JpaRepository<Planet, Long> {
}
