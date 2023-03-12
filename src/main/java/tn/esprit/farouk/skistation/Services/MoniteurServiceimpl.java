package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.Moniteur;
import tn.esprit.farouk.skistation.Repositories.CoursRepo;
import tn.esprit.farouk.skistation.Repositories.MoniteurRepo;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class MoniteurServiceimpl implements IMoniteurService{
    private MoniteurRepo moniteurRepo;
    private CoursRepo coursRepo;
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return moniteurRepo.findAll();
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }

    @Override
    public void remove(Long id) {
        moniteurRepo.deleteById(id);

    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {

        Cours course = coursRepo.findById(numCourse).orElse(null);
        Set<Cours> cours = new HashSet<>();
        cours.add(course);
        moniteur.setCours(cours);
        Assert.notNull(course, "course not found");

        return moniteurRepo.save(moniteur);
    }


}
