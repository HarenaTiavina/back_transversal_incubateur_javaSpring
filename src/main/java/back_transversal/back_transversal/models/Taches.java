package back_transversal.back_transversal.models;

public class Taches {
    private Long id;
    private Long idEtapes;
    private String nom;
    private double depense;
    private int etat;

    

    public Taches(Long id, Long idEtapes, String nom, double depense, int etat) {
        this.id = id;
        this.idEtapes = idEtapes;
        this.nom = nom;
        this.depense = depense;
        this.etat = etat;
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
     * @return Long return the idEtapes
     */
    public Long getIdEtapes() {
        return idEtapes;
    }

    /**
     * @param idEtapes the idEtapes to set
     */
    public void setIdEtapes(Long idEtapes) {
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