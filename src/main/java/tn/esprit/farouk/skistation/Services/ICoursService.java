package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Cours;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
}
