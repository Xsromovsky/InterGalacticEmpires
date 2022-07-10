package sk.samuel.projects.intergalacticempires.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sk.samuel.projects.intergalacticempires.entities.Empire;
import sk.samuel.projects.intergalacticempires.services.EmpireService;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/empires")
public class EmpireController {
    private EmpireService empireService;

    public EmpireController(EmpireService empireService){
        super();
        this.empireService = empireService;
    }

    @GetMapping
    public List<Empire> getAllEmpires(){
        return empireService.getAllEmpires();
    }
    @PostMapping
    public ResponseEntity<Empire> createNewEmpire(@RequestBody @Valid Empire empire){
        return new ResponseEntity<>(empireService.saveEmpire(empire), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Empire> getEmpireById(@PathVariable("id") long id){
        return new ResponseEntity<Empire>(empireService.getEmpireById(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Empire> updateEmpire(@PathVariable("id") Long id, @RequestBody @Valid Empire empire){
        return new ResponseEntity<Empire>(empireService.updateEmpire(id, empire), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public void deleteEmpire(@PathVariable("id") Long id){
        empireService.deleteEmpire(id);
    }



}
