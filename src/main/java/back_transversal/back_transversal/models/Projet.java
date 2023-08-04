package back_transversal.back_transversal.models;

import java.security.Timestamp;

public class Projet {
    private int id;
    private String nom;
    private String objectif;
    private int idClient;
    private Timestamp datePostule;
    private double capital;

    public Projet () {}

    public Projet(int id, String nom, String objectif, int idClient, Timestamp datePostule, double capital) {
        this.id = id;
        this.nom = nom;
        this.objectif = objectif;
        this.idClient = idClient;
        this.datePostule = datePostule;
        this.capital = capital;
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
     * @return String return the objectif
     */
    public String getObjectif() {
        return objectif;
    }

    /**
     * @param objectif the objectif to set
     */
    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    /**
     * @return int return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * @return Timestamp return the datePostule
     */
    public Timestamp getDatePostule() {
        return datePostule;
    }

    /**
     * @param datePostule the datePostule to set
     */
    public void setDatePostule(Timestamp datePostule) {
        this.datePostule = datePostule;
    }

    /**
     * @return double return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

}