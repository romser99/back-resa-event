package fr.solutec.resaevents.entites;

public class Etablissement {
    private int id;
    private String nom;

    private Adresse adresse;

    public Etablissement() {

    }
    public Etablissement(int id, String nom, int id_adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
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

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
