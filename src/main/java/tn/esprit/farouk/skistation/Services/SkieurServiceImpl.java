package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.Piste;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Repositories.AbonnementRepo;
import tn.esprit.farouk.skistation.Repositories.PisteRepo;
import tn.esprit.farouk.skistation.Repositories.SkieurRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class SkieurServiceImpl implements IskieurService {

    private SkieurRepo skieurRepo;
    private PisteRepo pisteRepo;
    private AbonnementRepo abonnementRepo;

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepo.save(s);
    }


    @Override
    public void removeSkieur(Long id) {
        skieurRepo.deleteById(id);
    }

    @Override
    public Skieur updateSkieur(Skieur s) {
        return skieurRepo.save(s);
    }

    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepo.findAll();
    }

    @Override
    public Skieur retrieveSkieur(Long id) {
        return skieurRepo.findById(id).orElse(null);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //recuperation des objets
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        //verifier if skieur not null
        Assert.notNull(skieur, "skieur not found");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        //verifier if piste not null
        Assert.notNull(piste, "piste not found");
        //traitement n7eb nchouf les objets  ljebthom w nzidhom l9dima w ba3ed l9dima m3a jdid n7otou f ligne lekher "skieur.setPistes(pistes);"
   /* Set<Piste> pistes = skieur.getPistes();
    pistes.add(piste);
    skieur.setPistes(pistes);
    */
        skieur.getPistes().add(piste);
        //save
        return skieurRepo.save(skieur);
    }

    @Override
    public Skieur assignSkierToAbonnement(Long numSkieur, Long numAbon) {
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Abonnement abonnement = abonnementRepo.findById(numAbon).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Assert.notNull(abonnement, "abonnement not found");
        skieur.setAbonnement(abonnement);
        return skieurRepo.save(skieur);
    }
}
