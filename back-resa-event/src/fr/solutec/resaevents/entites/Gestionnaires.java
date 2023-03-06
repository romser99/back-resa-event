package fr.solutec.resaevents.entites;

public class Gestionnaires extends Personnes {
    // portée - type - nom du champ
    private int id;
    private String libelle;
    /*
Définir méthodes(actions)
 */

    //Signature

    // portée - type de donnée retournée - nom(paramètres(type - nom))
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
