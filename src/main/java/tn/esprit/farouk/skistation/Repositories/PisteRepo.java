package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Piste;

public interface PisteRepo  extends JpaRepository<Piste,Long> {
}
