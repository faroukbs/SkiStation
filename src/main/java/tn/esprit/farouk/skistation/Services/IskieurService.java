package tn.esprit.farouk.skistation.Services;

import tn.esprit.farouk.skistation.Entities.Skieur;

import java.util.List;

public interface IskieurService {
    Skieur addSkieur(Skieur s);


    void removeSkieur(Long id);

    Skieur updateSkieur (Skieur s);

    List<Skieur> retrieveAllSkieurs ();

    Skieur retrieveSkieur (Long id);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur assignSkierToAbonnement(Long numSkieur, Long numAbon);



}
