package back_transversal.back_transversal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Etapes {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_Projet")
    private Projet projet;
    private String nom;
    private double capitalE;
    private double capitalR;
    private String observation;

    public Etapes () {}
    
    public Etapes(Long id, Projet projet, String nom, double capitalE, double capitalR, String observation) {
        this.id = id;
        this.projet = projet;
        this.nom = nom;
        this.capitalE = capitalE;
        this.capitalR = capitalR;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getCapitalE() {
        return capitalE;
    }

    public void setCapitalE(double capitalE) {
        this.capitalE = capitalE;
    }

    public double getCapitalR() {
        return capitalR;
    }

    public void setCapitalR(double capitalR) {
        this.capitalR = capitalR;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}