package fr.solutec.resaevent.entites;

import fr.solutec.resaevent.enums.RoleEnum;

public class Role {
    private int id;
    private RoleEnum libelle;

    public Role() {
    }

    public Role(int id, RoleEnum libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Role(int id) {
        this.id = id;
        this.libelle = null;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoleEnum getLibelle() {
        return this.libelle;
    }

    public void setLibelle(RoleEnum libelle) {
        this.libelle = libelle;
    }
}
