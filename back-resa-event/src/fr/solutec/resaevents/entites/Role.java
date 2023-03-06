package fr.solutec.resaevents.entites;
public class Role {
    // portée - type - nom du champ
    private int id;
    private boolean active;
    private String libelle;
    public Role () {
        this.active = false;
    }
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

    public void setActive(boolean active, boolean uppercase) {
        this.active = active;
    }

    public boolean getActive() {
        return this.active;
    }
}