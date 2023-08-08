package back_transversal.back_transversal.models;

public class Etapes {
    private Long id;
    private Long idProjet;
    private String nom;
    private double capitalE;
    private double capitalR;
    private String observation;
    
    

    public Etapes(Long id, Long idProjet, String nom, double capitalE, double capitalR, String observation) {
        this.id = id;
        this.idProjet = idProjet;
        this.nom = nom;
        this.capitalE = capitalE;
        this.capitalR = capitalR;
        this.observation = observation;
    }

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Long return the idProjet
     */
    public Long getIdProjet() {
        return idProjet;
    }

    /**
     * @param idProjet the idProjet to set
     */
    public void setIdProjet(Long idProjet) {
        this.idProjet = idProjet;
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return double return the capitalE
     */
    public double getCapitalE() {
        return capitalE;
    }

    /**
     * @param capitalE the capitalE to set
     */
    public void setCapitalE(double capitalE) {
        this.capitalE = capitalE;
    }

    /**
     * @return double return the capitalR
     */
    public double getCapitalR() {
        return capitalR;
    }

    /**
     * @param capitalR the capitalR to set
     */
    public void setCapitalR(double capitalR) {
        this.capitalR = capitalR;
    }

    /**
     * @return String return the observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(String observation) {
        this.observation = observation;
    }

}