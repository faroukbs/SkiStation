package tn.esprit.farouk.skistation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import tn.esprit.farouk.skistation.Entities.Abonnement;
import tn.esprit.farouk.skistation.Entities.TypeAbonnement;
import tn.esprit.farouk.skistation.Services.IAbonnementService;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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

    @GetMapping("ordersub/{type}")
    public Set<Abonnement> getSubscriptionByType(@PathVariable  TypeAbonnement type) {
        return iAbonnementService.getSubscriptionByType(type);
    }

    @GetMapping("betweendates/{startDate}/{endDate}")
    public List<Abonnement> retrieveSubscriptionsByDates(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate, @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        return iAbonnementService.retrieveSubscriptionsByDates(startDate,endDate);
    }
}
