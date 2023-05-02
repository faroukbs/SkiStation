package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Repository
public interface AbonnementRepo extends JpaRepository <Abonnement,Long> {

    Set<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement type);
    List<Abonnement> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

   // List<Abonnement>findByPrixAbonAndTypeAbonnement_Mensuel();

}
