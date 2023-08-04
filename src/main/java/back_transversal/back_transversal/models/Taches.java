package back_transversal.back_transversal.models;

public class Taches {
    private int id;
    private int idEtapes;
    private String nom;
    private double depense;
    private int etat;

    

    public Taches(int id, int idEtapes, String nom, double depense, int etat) {
        this.id = id;
        this.idEtapes = idEtapes;
        this.nom = nom;
        this.depense = depense;
        this.etat = etat;
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
     * @return int return the idEtapes
     */
    public int getIdEtapes() {
        return idEtapes;
    }

    /**
     * @param idEtapes the idEtapes to set
     */
    public void setIdEtapes(int idEtapes) {
        this.idEtapes = idEtapes;
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
     * @return double return the depense
     */
    public double getDepense() {
        return depense;
    }

    /**
     * @param depense the depense to set
     */
    public void setDepense(double depense) {
        this.depense = depense;
    }

    /**
     * @return int return the etat
     */
    public int getEtat() {
        return etat;
    }

    /**
     * @param etat the etat to set
     */
    public void setEtat(int etat) {
        this.etat = etat;
    }

}