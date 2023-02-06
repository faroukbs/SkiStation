package tn.esprit.farouk.skistation.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.farouk.skistation.Entities.Cours;
import tn.esprit.farouk.skistation.Services.ICoursService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cours")
public class CoursController {
    private ICoursService iCoursService;

    @PostMapping("/add")
    public Cours add(@RequestBody Cours p) {
        return iCoursService.addCours(p);
    }

    @PutMapping("/update")
    public Cours update(@RequestBody Cours p) {
        return iCoursService.updateCours(p);
    }

    @GetMapping("/get/{id}")
    public Cours get(@PathVariable("id") Long id) {
        return iCoursService.retrieveCours(id);
    }

    @GetMapping("/getAll")
    public List<Cours> getAll() {
        return iCoursService.retrieveAllCourses();
    }

    @DeleteMapping("/delete/{id}")
    public void Delete(@PathVariable("id")Long id){ iCoursService.remove(id);
    }
}
