package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Skieur;

import java.util.List;

public interface SkieurRepo  extends JpaRepository<Skieur,Long> {
    List<Skieur> findByVilleAndNomS(String ville, String nom);
    List<Skieur>findByAbonnementNumAbon(Long numabon);

}
