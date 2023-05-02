package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.farouk.skistation.Entities.*;
import tn.esprit.farouk.skistation.Repositories.*;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
@Slf4j
public class SkieurServiceImpl implements IskieurService {

    private SkieurRepo skieurRepo;
    private PisteRepo pisteRepo;
    private AbonnementRepo abonnementRepo;
    private InscriptionRepo inscriptionRepo;

    private CoursRepo coursRepo;

    @Override
    public Skieur addSkieur(Skieur s) {
        Abonnement abonad = s.getAbonnement();
        Abonnement addedabon = abonnementRepo.save(abonad);
        Skieur addedski = skieurRepo.save(s);
        addedski.setAbonnement(addedabon);
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
        // n7eb nchouf les objets  ljebthom w nzidhom l9dima w ba3ed l9dima m3a jdid n7otou f ligne lekher "skieur.setPistes(pistes);"
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

    @Override
    @Transactional
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        Assert.notNull(skieur.getAbonnement(), "Must be subscribed");
        Assert.notNull(skieur.getInscriptions(), "Must be Inscripted");
        skieur.getInscriptions().forEach(inscription -> Assert.notNull(inscription.getCours().getNumCours(), "inscription must have a course "));
        abonnementRepo.save(skieur.getAbonnement());
        for (Inscription i : skieur.getInscriptions()) {
            Cours c = coursRepo.findById(i.getCours().getNumCours()).orElse(null);
            i.setCours(c);
        }
        inscriptionRepo.saveAll(skieur.getInscriptions());
        return skieurRepo.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return skieurRepo.findByAbonnementTypeAbonnement(typeAbonnement);
    }

    @Override
    @Scheduled(cron = "*/30 * * * * *")
    public void retrieveSubscriptions() {
        List<Skieur> sk = skieurRepo.findByAbonnementDateFinGreaterThan(LocalDate.now().plusDays(7));
        for (Skieur s : sk) {
            //System.out.println(s);
            log.info(s.getAbonnement().getNumAbon() + s.getNumSkieur() + s.getNomS() + s.getPrenomS());
        }
    }
}
