package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Moniteur;

public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {
}
