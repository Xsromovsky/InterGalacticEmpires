package sk.samuel.projects.intergalacticempires.services;

import org.springframework.stereotype.Service;
import sk.samuel.projects.intergalacticempires.entities.Empire;
import sk.samuel.projects.intergalacticempires.repositories.EmpireRepository;

import java.util.List;


@Service
public class EmpireServiceImplementation implements EmpireService{

    EmpireRepository empireRepository;

    public EmpireServiceImplementation(EmpireRepository empireRepository){
        super();
        this.empireRepository = empireRepository;
    }

    @Override
    public List<Empire> getAllEmpires() {
        return empireRepository.findAll();
    }

    @Override
    public Empire saveEmpire(Empire empire) {
        return empireRepository.save(empire);
    }

    @Override
    public Empire getEmpireById(Long id) {
        return empireRepository.findById(id).orElse(null);
    }

    @Override
    public Empire updateEmpire(Long id, Empire empire) {
        return empireRepository.save(empire);
    }

    @Override
    public void deleteEmpire(Long id) {
        empireRepository.deleteById(id);
    }
}
