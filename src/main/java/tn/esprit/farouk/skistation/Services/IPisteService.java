package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Piste;

import java.util.List;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Piste retrievePiste (Long numPiste);
    void remove(Long id);
}
