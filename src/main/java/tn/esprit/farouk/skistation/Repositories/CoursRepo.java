package tn.esprit.farouk.skistation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.farouk.skistation.Entities.Cours;

import java.util.List;

@Repository
public interface CoursRepo extends JpaRepository<Cours,Long> {


}
