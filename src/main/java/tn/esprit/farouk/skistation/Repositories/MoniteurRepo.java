package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Moniteur;
import tn.esprit.farouk.skistation.Entities.Support;

import java.util.List;
@Repository
public interface MoniteurRepo extends JpaRepository<Moniteur,Long> {
   Moniteur findByNumMonitorAndCoursSupport(Long numMoniteur, Support support);
}
