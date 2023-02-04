package tn.esprit.farouk.skistation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.farouk.skistation.Entities.Skieur;
import tn.esprit.farouk.skistation.Services.IskieurService;

@RestController
@AllArgsConstructor
public class SkieurController {
    private IskieurService iskieurService;

    @PostMapping("/addskieur")
    public Skieur addSkieur(@RequestBody Skieur s) {
        return iskieurService.addSkieur(s);
    }

}
