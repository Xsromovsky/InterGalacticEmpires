package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "empires")
public class Empire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name_of_empire")
    @Size(min = 5,max = 32, message = "Name of empire must have 5 to 40 characters")
    private String nameOfEmpire;
    @Column(name = "name_of_leader")
    @Size(min = 2,max = 32, message = "Name of leader must have 2 to 32 characters")
    private String nameOfLeader;
    @Column(name = "species")
    @Size(min = 4,max = 32, message = "Name of species must have 4 to 32 characters")
    private String species;
    //private int numberOfPlanets;
    //private int totalPopulation;


}
