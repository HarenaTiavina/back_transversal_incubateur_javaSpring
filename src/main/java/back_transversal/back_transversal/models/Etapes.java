package back_transversal.back_transversal.models;

public class Etapes {
    private int id;
    private int idProjet;
    private String nom;
    private double capitalE;
    private double capitalR;
    private String observation;
    
    

    public Etapes(int id, int idProjet, String nom, double capitalE, double capitalR, String observation) {
        this.id = id;
        this.idProjet = idProjet;
        this.nom = nom;
        this.capitalE = capitalE;
        this.capitalR = capitalR;
        this.observation = observation;
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