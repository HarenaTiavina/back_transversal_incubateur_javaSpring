package back_transversal.back_transversal.models;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String mdp;
    private String profil;

    public Personne () {}

   public Personne(int id, String nom, String prenom, String adresse, String mdp, String profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mdp = mdp;
        this.profil = profil;
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
     * @return String return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return String return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return String return the mdp
     */
    public String getMdp() {
        return mdp;
    }

    /**
     * @param mdp the mdp to set
     */
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    /**
     * @return String return the profil
     */
    public String getProfil() {
        return profil;
    }

    /**
     * @param profil the profil to set
     */
    public void setProfil(String profil) {
        this.profil = profil;
    }

}