package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement(Abonnement abonnement);

    Abonnement retrieveAbonnement(Long numAbonnement);

    void remove(Long id);

    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);

    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate);

    public void showMonthlyRecurringRevenue();
}
