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
    private long population;
    @Column(name = "total_species")
    private long totalSpecies;
    @Column(name = "minerals")
    private long minerals;
    @Column(name = "energy")
    private long energy;
    @Column(name = "research")
    private long research;
    @Column(name = "alloys")
    private long alloys;
}
