package back_transversal.back_transversal.models;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class ValidationGestion {
    @Id
    private int id;
    // @OneToOne(mappedBy = "projet")
    private int idProjet;
    // @OneToOne(mappedBy = "personne")
    private int idGestionnaire;
    // @OneToOne(mappedBy = "personne")
    private int idPatron;
    private Timestamp dateGestion;
    private Timestamp datePatron;

    

    public ValidationGestion(int id, int idProjet, int idGestionnaire, int idPatron, Timestamp dateGestion,
            Timestamp datePatron) {
        this.id = id;
        this.idProjet = idProjet;
        this.idGestionnaire = idGestionnaire;
        this.idPatron = idPatron;
        this.dateGestion = dateGestion;
        this.datePatron = datePatron;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }

    public int getIdPatron() {
        return idPatron;
    }

    public void setIdPatron(int idPatron) {
        this.idPatron = idPatron;
    }

    public Timestamp getDateGestion() {
        return dateGestion;
    }

    public void setDateGestion(Timestamp dateGestion) {
        this.dateGestion = dateGestion;
    }

    public Timestamp getDatePatron() {
        return datePatron;
    }

    public void setDatePatron(Timestamp datePatron) {
        this.datePatron = datePatron;
    }

}