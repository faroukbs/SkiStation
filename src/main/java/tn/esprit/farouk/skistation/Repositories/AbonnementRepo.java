package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Abonnement;

@Repository
public interface AbonnementRepo extends JpaRepository <Abonnement,Long> {
}
