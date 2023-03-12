package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Inscription retrieveInscription (Long numCours);
    void remove(Long id);
    Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);
}
