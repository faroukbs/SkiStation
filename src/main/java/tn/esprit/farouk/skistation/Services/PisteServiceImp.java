package tn.esprit.farouk.skistation.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.farouk.skistation.Entities.Piste;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServiceImp implements IPisteService {
    @Override
    public List<Piste> retrieveAllPistes() {
        return null;
    }

    @Override
    public Piste addPiste(Piste piste) {
        return null;
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return null;
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return null;
    }
}
