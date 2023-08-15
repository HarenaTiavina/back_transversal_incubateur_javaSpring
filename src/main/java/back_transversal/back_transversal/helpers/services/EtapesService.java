package back_transversal.back_transversal.helpers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import back_transversal.back_transversal.helpers.interfaces.EtapesRepository;
import back_transversal.back_transversal.models.Etapes;

@Service
public class EtapesService {
    private final EtapesRepository etapesRepository;

    public EtapesService (EtapesRepository etapesRepository) {
        this.etapesRepository = etapesRepository;
    }

    public List<Etapes> getAll () {
        return etapesRepository.findAll();
    }

    public Etapes save (Etapes etapes) {
        return etapesRepository.save(etapes);
    }

    public Etapes getById (Long id) {
        return etapesRepository.findById(id).orElse(null);
    }

    public Etapes update (Long id, Etapes etapes) {
        if(etapesRepository.existsById(id)) {
            etapes.setId(id);
            return etapesRepository.save(etapes);
        }
        return null;
    }

    public void delete (Long id ) {
        etapesRepository.deleteById(id);
    }
}