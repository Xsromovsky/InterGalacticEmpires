package sk.samuel.projects.intergalacticempires.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    private String nameOfEmpire;
    @Column(name = "name_of_leader")
    private String nameOfLeader;
    @Column(name = "species")
    private String species;
    //private int numberOfPlanets;
    //private int totalPopulation;


}
