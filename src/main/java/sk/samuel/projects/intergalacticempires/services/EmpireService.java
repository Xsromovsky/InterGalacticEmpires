package sk.samuel.projects.intergalacticempires.services;

import org.hibernate.tool.schema.internal.StandardUniqueKeyExporter;
import sk.samuel.projects.intergalacticempires.entities.Empire;

import java.util.List;

public interface EmpireService {

    List<Empire> getAllEmpires();

    Empire saveEmpire(Empire empire);
    Empire getEmpireById(Long Id);
    Empire updateEmpire(Long id, Empire empire);

    void deleteEmpire(Long id);
}
