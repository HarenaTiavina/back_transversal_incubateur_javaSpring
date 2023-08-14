package back_transversal.back_transversal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Taches {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "id_etapes")
    private Etapes etapes;
    private String nom;
    private double depense;
    private int etat;

    public Taches () {}

    public Taches(Long id, Etapes etapes, String nom, double depense, int etat) {
        this.id = id;
        this.etapes = etapes;
        this.nom = nom;
        this.depense = depense;
        this.etat = etat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Etapes getEtapes() {
        return etapes;
    }

    public void setEtapes(Etapes etapes) {
        this.etapes = etapes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getDepense() {
        return depense;
    }

    public void setDepense(double depense) {
        this.depense = depense;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

}