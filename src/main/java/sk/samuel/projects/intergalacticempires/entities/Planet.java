package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

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
    @Size(min = 1,max = 15, message = "Name of planet must have 1 to 15 characters")
    private String name;

    @Column(name = "population")
    @Min(value = 100000, message = "Population must be bigger than 100K")
    private long population;

    @Column(name = "total_species")
    @Min(value = 1, message = "You need to have at least 1 species")
    private long totalSpecies;

    @Column(name = "minerals")
    @Min(value = 0, message = "Minerals can't be in negative numbers")
    private long minerals;

    @Column(name = "energy")
    @Min(value = 0, message = "Energy can't be in negative number")
    private long energy;

    @Column(name = "research")
    @Min(value = 0, message = "Research can't be in negative number")
    private long research;

    @Column(name = "alloys")
    @Min(value = 0, message = "Alloys can't be in negative number")
    private long alloys;
}
