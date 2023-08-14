package back_transversal.back_transversal.helpers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back_transversal.back_transversal.helpers.services.EtapesService;
import back_transversal.back_transversal.models.Etapes;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/etapes")
public class EtapesController {
    private final EtapesService etapesService;

    @Autowired
    public EtapesController (EtapesService etapesService) {
        this.etapesService = etapesService;
    }

    @GetMapping
    public List<Etapes> getAllEtapes () {
        return this.etapesService.getAll();
    }

    @GetMapping(value="/{id}")
    public Etapes getEtapeId(@PathVariable Long id) {
        return this.etapesService.getById(id);
    }

    @PostMapping
    public Etapes createEtapes(@RequestBody Etapes etapes) {
        return this.etapesService.save(etapes);
    }

    @PutMapping(value="/{id}")
    public Etapes updateEtape(@PathVariable Long id, @RequestBody Etapes etapes) {
        return this.etapesService.update(id, etapes);
    }
    
    @DeleteMapping(value="/{id}")
    public void deleteEtape (@PathVariable Long id){
        this.etapesService.delete(id);
    }
}