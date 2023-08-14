package back_transversal.back_transversal.helpers.services;

import java.util.List;

import org.springframework.stereotype.Service;

import back_transversal.back_transversal.helpers.interfaces.TachesRepository;
import back_transversal.back_transversal.models.Taches;

@Service
public class TachesServices {
    private final TachesRepository tachesRepository;

    public TachesServices(TachesRepository tachesRepository) {
        this.tachesRepository = tachesRepository;
    }

    public List<Taches> getAll () {
        return this.tachesRepository.findAll();
    }

    public Taches getId (Long id) {
        return this.tachesRepository.findById(id).orElse(null);
    }

    public Taches create (Taches taches ) {
        return this.tachesRepository.save(taches);
    }

    public Taches update (Long id, Taches taches) {
        if(this.tachesRepository.existsById(id)) {
            taches.setId(id);
            return this.tachesRepository.save(taches);
        }
        return null;
    }

    public void delete (Long id) {
        this.tachesRepository.deleteById(id);
    }
}