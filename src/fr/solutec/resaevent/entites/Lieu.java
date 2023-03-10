package fr.solutec.resaevent.entites;

public class Lieu {
    private int id;
    private String nom;
    private String pays;
    private String adresse;
    private String region;
    private String alias;
    private int adresse_id;

    public Lieu() {
    }

    public Lieu(int id, String nom, String pays, String adresse, String region, String alias, int adresse_id) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
        this.adresse = adresse;
        this.region = region;
        this.alias = alias;
        this.adresse_id = adresse_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAdresse_id() {
        return adresse_id;
    }

    public void setAdresse_id(int adresse_id) {
        this.adresse_id = adresse_id;
    }
}