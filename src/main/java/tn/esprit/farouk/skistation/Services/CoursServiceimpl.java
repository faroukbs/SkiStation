package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Cours;

import java.util.List;

@AllArgsConstructor
@Service
public class CoursServiceimpl implements ICoursService {
    @Override
    public List<Cours> retrieveAllCourses() {
        return null;
    }

    @Override
    public Cours addCours(Cours cours) {
        return null;
    }

    @Override
    public Cours updateCours(Cours cours) {
        return null;
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return null;
    }
}
