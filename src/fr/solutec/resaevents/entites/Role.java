package fr.solutec.resaevents.entites;

import fr.solutec.resaevents.enums.RoleEnum;

public class Role {
    // portée type nom;
    private int id;
    private RoleEnum libelle;

    public Role() {

    }

    public Role(int id, RoleEnum libelle) {
        this.id= id;
        this.libelle = libelle;
    }

    public Role(int id) {
        this.id= id;
        this.libelle = null;
    }


    /*
       - portée
       - type de donnée retournée ou void si la méthode ne retourne rien
       - nom
       - entre paranthèse les eventuels paramètres
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public RoleEnum getLibelle() {
        return libelle;
    }

    public void setLibelle(RoleEnum libelle) {
        this.libelle = libelle;
    }
}
