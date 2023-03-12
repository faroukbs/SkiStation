package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.Inscription;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Entities.TypeCours;
import tn.esprit.farouk.skistation.Repositories.CoursRepo;
import tn.esprit.farouk.skistation.Repositories.InscriptionRepo;
import tn.esprit.farouk.skistation.Repositories.SkieurRepo;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class InscriptionServiceImpl implements IInscriptionService {
    private InscriptionRepo inscriptionRepo;
    private SkieurRepo skieurRepo;
    private CoursRepo coursRepo;

    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription cours) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription cours) {
        return null;
    }


    @Override
    public Inscription retrieveInscription(Long numCours) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        Cours c = coursRepo.findById(numCours).orElse(null);
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        int conteur = 0;
        for (Inscription i : c.getInscriptions()) {
            if (i.getSkieur() != null) {
                conteur++;
            }
        }
        if (conteur < 6) {
            long years = java.time.temporal.ChronoUnit.YEARS.between( skieur.getDateNaissance(),LocalDate.now());
            System.out.println(years);
            if (years < 18) {
                if (c.getTypeCours() == TypeCours.COLLECTIF_ENFANT) {
                    inscription.setCours(c);
                    inscription.setSkieur(skieur);
                }
            } else if (years > 18) {
                if (c.getTypeCours() == TypeCours.COLLECTIF_ADULTE) {
                    inscription.setCours(c);
                    inscription.setSkieur(skieur);
                }
            }

        }

        return inscriptionRepo.save(inscription);
    }
}
