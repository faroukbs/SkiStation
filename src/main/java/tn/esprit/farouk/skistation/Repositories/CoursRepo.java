package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.farouk.skistation.Entities.Cours;

public interface CoursRepo extends JpaRepository<Cours,Long> {
}
