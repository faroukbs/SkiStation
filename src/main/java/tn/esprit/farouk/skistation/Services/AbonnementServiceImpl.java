package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;
import tn.esprit.farouk.skistation.Repositories.AbonnementRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@Service
public class AbonnementServiceImpl implements IAbonnementService {
    private AbonnementRepo abonnementRepo;

    @Override
    public List<Abonnement> retrieveAllAbonnements() {
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
        return abonnementRepo.findByDateDebutBetween(startDate,endDate);
    }
}
