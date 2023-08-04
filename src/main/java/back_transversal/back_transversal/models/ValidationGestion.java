package back_transversal.back_transversal.models;

import java.security.Timestamp;

public class ValidationGestion {
    private int id;
    private int idProjet;
    private int idGestionnaire;
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

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return int return the idProjet
     */
    public int getIdProjet() {
        return idProjet;
    }

    /**
     * @param idProjet the idProjet to set
     */
    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    /**
     * @return int return the idGestionnaire
     */
    public int getIdGestionnaire() {
        return idGestionnaire;
    }

    /**
     * @param idGestionnaire the idGestionnaire to set
     */
    public void setIdGestionnaire(int idGestionnaire) {
        this.idGestionnaire = idGestionnaire;
    }

    /**
     * @return int return the idPatron
     */
    public int getIdPatron() {
        return idPatron;
    }

    /**
     * @param idPatron the idPatron to set
     */
    public void setIdPatron(int idPatron) {
        this.idPatron = idPatron;
    }

    /**
     * @return Timestamp return the dateGestion
     */
    public Timestamp getDateGestion() {
        return dateGestion;
    }

    /**
     * @param dateGestion the dateGestion to set
     */
    public void setDateGestion(Timestamp dateGestion) {
        this.dateGestion = dateGestion;
    }

    /**
     * @return Timestamp return the datePatron
     */
    public Timestamp getDatePatron() {
        return datePatron;
    }

    /**
     * @param datePatron the datePatron to set
     */
    public void setDatePatron(Timestamp datePatron) {
        this.datePatron = datePatron;
    }

}