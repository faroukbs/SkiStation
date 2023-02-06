package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Entities.Inscription;
import tn.esprit.farouk.skistation.Repositories.InscriptionRepo;

import java.util.List;

@AllArgsConstructor
@Service
public class InscriptionServiceImpl implements IInscriptionService {
    private InscriptionRepo inscriptionRepo;
    @Override
    public List<Inscription> retrieveAllInscription() {
        return inscriptionRepo.findAll();
    }

    @Override
    public Inscription addInscription(Inscription cours) {
        return null;
    }

    @Override
    public Inscription updateInscription(Inscription cours) {
        return null;
    }



    @Override
    public Inscription retrieveInscription(Long numCours) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
