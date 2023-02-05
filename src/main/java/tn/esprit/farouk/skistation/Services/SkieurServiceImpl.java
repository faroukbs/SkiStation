package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Repositories.SkieurRepo;

@AllArgsConstructor
@Service
public class SkieurServiceImpl implements IskieurService{

    private SkieurRepo skieurRepo;

    @Override
    public Skieur addSkieur(Skieur s) {
        return skieurRepo.save(s);
    }
}
