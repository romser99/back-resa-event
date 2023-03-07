package fr.solutec.resaevents.services;

import fr.solutec.resaevents.entites.Role;
import fr.solutec.resaevents.enums.RoleEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static fr.solutec.resaevents.utils.Data.ROLES_LABELS;

public class RoleService {

    public Role create(Role role) {
        int id = (int)(Math.random() * 50 + 1);
        // Ne pas definir l'id
        role.setId(id);
        // Stocker dans une BDD
        //return role;
        return new Role(id, role.getLibelle());
    }

    public List<Role> list() {
        // faire une requête

        List<Role> roles = new ArrayList<>();
        for (RoleEnum roleLabel: ROLES_LABELS) {
            int id = (int)(Math.random() * 50 + 1);
            Role role = new Role();
            role.setLibelle(roleLabel);
            role.setId(id);
            roles.add(role);
        }
        return roles;
    }

    /**
     * Retourne un role en fonction de son libelle
     * @param libelle
     * @return Role
     */
    public Role read(RoleEnum libelle) {
        // faire une requête
        List<Role> roles = this.list();
        Role role;
        switch (libelle) {
            case ADMIN:
                role = this.filter(roles, libelle);
                break;
            case GESTIONNAIRE:
                role = this.filter(roles, libelle);
                break;
            case UTILISATEUR:
                role = this.filter(roles, libelle);
                break;
            default:
                role = null;
                break;
        }
        return role;
    }

    public void delete(int id) {
        // potentielle suppression dans une base de données
    }

    private Role filter(List<Role> roles, RoleEnum libelle) {
        return roles.stream().filter(role -> role.getLibelle().equals(libelle)).findFirst().get();
    }
}
