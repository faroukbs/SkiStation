package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Moniteur;
import tn.esprit.farouk.skistation.Entities.Skieur;

import java.util.List;

public interface IMoniteurService {
    List<Moniteur> retrieveAllMoniteurs();
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur (Moniteur moniteur);
    Moniteur retrieveMoniteur (Long numMoniteur);
    void remove(Long id);
    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
