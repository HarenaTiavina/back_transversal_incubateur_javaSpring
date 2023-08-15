package back_transversal.back_transversal.helpers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import back_transversal.back_transversal.helpers.interfaces.PersonneRepository;
import back_transversal.back_transversal.models.Personne;

@Service
public class PersonneService {
    private final PersonneRepository personneRepository;

    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> getAll () {
        return personneRepository.findAll();
    }

    public Personne save (Personne personne) {
        return personneRepository.save(personne);
    }

    public Personne getById (Long id) {
        return personneRepository.findById(id).orElse(null);
    }

    public Personne update (Long id, Personne personne) {
        if(personneRepository.existsById(id)) {
            personne.setId(id);
            return personneRepository.save(personne);
        }
        return null;
    }

    public void delete (Long id ) {
        personneRepository.deleteById(id);
    }

    // @Override
    // public Personne loadPersonneByNom (String nom) throws Exception {
    //     try {
    //         Personne personne = this.personneRepository.findByNom(personne.getNom());
    //         if(personne == null) {
    //             throw new Exception("personne not found");
    //         }    
    //     } catch (Exception e) {
    //         throw new Exception(e);
    //     }
        
    //  }
}