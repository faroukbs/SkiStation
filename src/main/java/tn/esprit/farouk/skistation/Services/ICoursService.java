package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.Support;

import java.util.List;

public interface ICoursService {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    void remove(Long id);
    List<Integer> numWeeksCourseOfInstructorBySupport(Long numInstructor, Support support);
}
