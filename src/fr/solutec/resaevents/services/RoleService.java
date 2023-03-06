package fr.solutec.resaevents.services;

import fr.solutec.resaevents.entites.Role;
public class RoleService {
    public Role create(Role role) {
        Role newrole = new Role();
        newrole.setLibelle(role.getLibelle());
        newrole.setId(role.getId());
        return newrole;
    }

    public void display(Role role) {
        System.out.println("le role " + role.getLibelle() + " a l'id " + role.getId());
    }
}
