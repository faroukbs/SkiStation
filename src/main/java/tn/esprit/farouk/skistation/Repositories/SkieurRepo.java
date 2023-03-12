package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface SkieurRepo  extends JpaRepository<Skieur,Long> {
    List<Skieur> findByVilleAndNomS(String ville, String nom);
    List<Skieur>findByAbonnementNumAbon(Long numabon);

    List<Skieur> findByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);

    List<Skieur> findByAbonnementDateFinGreaterThan(LocalDate dateFin);



}
