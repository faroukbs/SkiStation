package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Abonnement;

public interface AbonnementRepo extends JpaRepository <Abonnement,Long> {
}
