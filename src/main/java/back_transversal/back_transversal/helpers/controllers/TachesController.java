package back_transversal.back_transversal.helpers.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_transversal.back_transversal.helpers.services.TachesServices;
import back_transversal.back_transversal.models.Taches;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value="/api/taches")
public class TachesController {
    private final TachesServices tachesServices;

    public TachesController(TachesServices tachesServices) {
        this.tachesServices = tachesServices;
    }

    @GetMapping
    public List<Taches> getAllTaches () {
        return this.tachesServices.getAll();
    }

    @GetMapping(value = "/{id}")
    public Taches getTaches (@PathVariable Long id) {
        return this.tachesServices.getId(id);
    } 

    @PostMapping
    public Taches createtaches(@RequestBody Taches entity) {
        return this.tachesServices.create(entity);
    }

    @PutMapping(value="/{id}")
    public Taches updateTaches(@PathVariable Long id, @RequestBody Taches taches) {
        return this.tachesServices.update(id,taches);
    }

    @DeleteMapping(value="/{id}")
    public void deletetache(@PathVariable Long id) {
        this.tachesServices.delete(id);
    }
    
}