package back_transversal.back_transversal.helpers.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import back_transversal.back_transversal.models.Taches;

public interface TachesRepository extends JpaRepository<Taches, Long> {
    
}