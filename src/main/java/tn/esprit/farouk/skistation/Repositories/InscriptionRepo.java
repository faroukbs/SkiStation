package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Inscription;

public interface InscriptionRepo extends JpaRepository <Inscription,Long> {
}
