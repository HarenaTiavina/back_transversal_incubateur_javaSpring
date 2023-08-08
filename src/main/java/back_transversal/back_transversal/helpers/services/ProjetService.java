package back_transversal.back_transversal.helpers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import back_transversal.back_transversal.helpers.interfaces.ProjetRepository;
import back_transversal.back_transversal.models.Projet;

@Service
public class ProjetService {
    private final ProjetRepository projetRepository;

    public ProjetService (ProjetRepository projetRepository) {
        this.projetRepository = projetRepository;
    }

    public List<Projet> getAll () {
        return this.projetRepository.findAll();
    }

    public Projet getProjet (Long id ) {
        return this.projetRepository.findById(id).orElse(null);
    }

    public Projet save (Projet projet) {
        return this.projetRepository.save(projet);
    }

        public Projet update (Long id, Projet projet) {
        if(this.projetRepository.existsById(id)) {
            projet.setId(id);
            return this.projetRepository.save(projet);
        }
        return null;
    }

    public void delete (Long id ) {
        this.projetRepository.deleteById(id);
    }
}