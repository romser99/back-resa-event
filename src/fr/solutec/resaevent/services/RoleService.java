package fr.solutec.resaevent.services;

import fr.solutec.resaevent.entites.Role;
import fr.solutec.resaevent.enums.RoleEnum;
import fr.solutec.resaevent.utils.Data;
import java.util.ArrayList;
import java.util.List;

public class RoleService {
    public RoleService() {
    }

    public Role create(Role role) {
        int id = (int)(Math.random() * 50.0 + 1.0);
        role.setId(id);
        return new Role(id, role.getLibelle());
    }

    public List<Role> list() {
        List<Role> roles = new ArrayList();
        RoleEnum[] var2 = Data.ROLES_LABELS;
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            RoleEnum roleLabel = var2[var4];
            int id = (int)(Math.random() * 50.0 + 1.0);
            Role role = new Role();
            role.setLibelle(roleLabel);
            role.setId(id);
            roles.add(role);
        }

        return roles;
    }

    public Role read(RoleEnum libelle) {
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
        }

        return role;
    }

    public void delete(int id) {
    }

    private Role filter(List<Role> roles, RoleEnum libelle) {
        return (Role)roles.stream().filter((role) -> {
            return role.getLibelle().equals(libelle);
        }).findFirst().get();
    }
}
