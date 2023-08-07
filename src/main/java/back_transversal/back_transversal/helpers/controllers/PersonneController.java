package back_transversal.back_transversal.helpers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_transversal.back_transversal.helpers.interfaces.PersonneRepository;
import back_transversal.back_transversal.helpers.services.PersonneService;
import back_transversal.back_transversal.models.Personne;

@RestController
@RequestMapping("/api/personnes")
public class PersonneController {
    private final PersonneService personneService;

    @Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> getAllPersonnes()  {
        return personneService.getAll();
    }

    @PostMapping
    public Personne createPersonne(@RequestBody Personne personne){
        return personneService.save(personne);
    }

    @GetMapping("/{id}")
    public Personne getPersonneById(@PathVariable Long id) {
        return personneService.getById(id);
    }

    @PutMapping("/{id}")
    public Personne updatPersonne (@PathVariable Long id, @RequestBody Personne personne) {
        return personneService.update(id, personne);
    }

    @DeleteMapping("/{id}")
    public void deletePersonne(@PathVariable Long id ) {
        personneService.delete(id);
    }
}