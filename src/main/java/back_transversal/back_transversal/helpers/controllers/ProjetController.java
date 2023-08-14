package back_transversal.back_transversal.helpers.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_transversal.back_transversal.helpers.services.ProjetService;
import back_transversal.back_transversal.models.Projet;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/Projets")
public class ProjetController {
    private final ProjetService projetService;

    public ProjetController (ProjetService projetService) {
        this.projetService = projetService;
    }

    @GetMapping
    public List<Projet> getAll() {
        return this.projetService.getAll();
    } 

    @GetMapping(value="/{id}") 
    public Projet getProjetId (@PathVariable Long id) {
        return this.projetService.getProjet(id);
    }

    @PostMapping
    public Projet createProjet (@RequestBody Projet projet) {
        return this.projetService.save(projet);
    }

    @PutMapping(value="/{id}")
    public Projet updateProjet(@PathVariable Long id, @RequestBody Projet projet) {
        return this.projetService.update(id, projet);
    }

    @DeleteMapping(value="/{id}")
    public void deleteProjet(@PathVariable Long id) {
        this.projetService.delete(id);
    }
}