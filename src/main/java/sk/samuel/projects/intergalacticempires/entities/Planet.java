package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "planet")
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "population")
    private int population;
    @Column(name = "total_species")
    private int totalSpecies;
    @Column(name = "minerals")
    private int minerals;
    @Column(name = "energy")
    private int energy;
    @Column(name = "research")
    private int research;
    @Column(name = "alloys")
    private int alloys;
}
