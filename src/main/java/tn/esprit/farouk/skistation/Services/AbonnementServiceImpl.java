package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;
import tn.esprit.farouk.skistation.Repositories.AbonnementRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
@Slf4j
public class AbonnementServiceImpl implements IAbonnementService {
    private final AbonnementRepo abonnementRepo;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {

        log.info("in method : retrieveAllAbonnements" );
        log.info("out method : retrieveAllAbonnements " );

        return abonnementRepo.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void remove(Long id) {
        abonnementRepo.deleteById(id);

    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return abonnementRepo.findByTypeAbonnementOrderByDateDebut(type);
    }

    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return abonnementRepo.findByDateDebutBetween(startDate, endDate);
    }

   /* @Override
    @Scheduled(cron = "*//*30 * * * * *" )

    /*public void showMonthlyRecurringRevenue() {
        float sum;
      List<Abonnement> ab= abonnementRepo.findByPrixAbonAndTypeAbonnement_Mensuel();
      for (Abonnement a : ab){
          sum=a.getPrixAbon();
      }
    }*/
}
