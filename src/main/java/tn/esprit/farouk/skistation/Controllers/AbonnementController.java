package tn.esprit.farouk.skistation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Services.IAbonnementService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AbonnementController {
    private IAbonnementService iAbonnementService;

    @PostMapping("/add")
    public Abonnement add(@RequestBody Abonnement p) {
        return iAbonnementService.addAbonnement(p);
    }

    @PutMapping("/update")
    public Abonnement update(@RequestBody Abonnement p) {
        return iAbonnementService.updateAbonnement(p);
    }

    @GetMapping("/get/{id}")
    public Abonnement get(@PathVariable("id") Long id) {
        return iAbonnementService.retrieveAbonnement(id);
    }

    @GetMapping("/getAll")
    public List<Abonnement> getAll() {
        return iAbonnementService.retrieveAllAbonnements();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iAbonnementService.remove(id);
    }
}
