package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Moniteur;

import java.util.List;
@Repository
public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {



}
