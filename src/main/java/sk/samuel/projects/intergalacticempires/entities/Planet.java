package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet {
    private Long id;
    private String name;
    private int populationOfPlanet;
    private int totalSpecies;
    private int minerals;
    private int energy;
    private int research;
    private int alloys;
}
