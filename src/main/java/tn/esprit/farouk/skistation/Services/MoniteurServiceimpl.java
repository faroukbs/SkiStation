package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Moniteur;

import java.util.List;

@AllArgsConstructor
@Service
public class MoniteurServiceimpl implements IMoniteurService{
    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return null;
    }

    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return null;
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return null;
    }
}
