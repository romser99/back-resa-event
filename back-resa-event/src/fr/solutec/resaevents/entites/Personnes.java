package fr.solutec.resaevents.entites;

public class Personnes {
    // portée - type - nom du champ
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String motdepasse;
    private String telephone;

    //Signature
// portée - type de donnée retournée - nom(paramètres(type - nom))
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }
    public String getnom() {
        return this.nom;
    }

    public void setprenom(String prenom) {
        this.prenom = prenom;
    }
    public String getprenom() {
        return this.prenom;
    }

    public void setmail(String libelle) {
        this.mail = mail;
    }
    public String getmail() {
        return this.mail;
    }

    public void setmotdepasse(String mot_de_passe) {
        this.motdepasse = mot_de_passe;
    }
    public String getmotdepasse() {
        return this.motdepasse;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }
    public String gettelephone() {
        return this.telephone;
    }
}
