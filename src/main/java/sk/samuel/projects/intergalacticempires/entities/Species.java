package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "species")
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "species")
    private String species;
    @Column(name = "totoal_population_of_species")
    private long totalPopulationOfSpecies;

}
