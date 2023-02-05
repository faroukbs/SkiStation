package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Piste;

import java.util.List;
@Repository
public interface PisteRepo  extends JpaRepository<Piste,Long> {

}
