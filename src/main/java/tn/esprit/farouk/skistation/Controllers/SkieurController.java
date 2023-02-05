package tn.esprit.farouk.skistation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Services.IskieurService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {
    private IskieurService iskieurService;

    @PostMapping("/add")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return iskieurService.addSkieur(s);
    }

    @PutMapping("/update")
    public Skieur updateSkieur(@RequestBody Skieur skieur) {
        return iskieurService.updateSkieur(skieur);
    }

    @GetMapping("/get/{id}")
    public Skieur getSkieur(@PathVariable("id") Long numSkieur) {
        return iskieurService.retrieveSkieur(numSkieur);
    }

    @GetMapping("/getAll")
    public List<Skieur> getAllSkieurs() {
        return iskieurService.retrieveAllSkieurs();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iskieurService.removeSkieur(id);
    }
}
