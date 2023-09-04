package back_transversal.back_transversal.models;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProjet")
@SequenceGenerator(name = "idProjet", sequenceName = "idProjet", allocationSize = 1)

    private Long id;
    private String nom;
    private String objectif;
    @OneToOne
    @JoinColumn(name = "id_Client")
    private  Personne personne;
    private Timestamp datePostule;
    private double capital;
    private String cahierCharge;
    private int etat;

    public Projet () {}

    public Projet(Long id, String nom, String objectif, Personne personne, Timestamp datePostule, double capital, String cahierCharge, int etat) {
        this.id = id;
        this.nom = nom;
        this.objectif = objectif;
        this.personne = personne;
        this.datePostule = datePostule;
        this.capital = capital;
        this.cahierCharge = cahierCharge;
        this.etat = etat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Timestamp getDatePostule() {
        return datePostule;
    }

    public void setDatePostule(Timestamp datePostule) {
        this.datePostule = datePostule;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getCahierCharge() {
        return cahierCharge;
    }

    public void setCahierCharge(String cahierCharge) {
        this.cahierCharge = cahierCharge;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    
}