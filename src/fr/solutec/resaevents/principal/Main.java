package fr.solutec.resaevents.principal;

import fr.solutec.resaevents.entites.Role;
import fr.solutec.resaevents.services.RoleService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // Demander le libelle d'un role à l'utilisateur
        /**
         * - Classe BufferedReader
         * - Objet(Instance de classe) reader (On peut nomme on veut)
         * - mon clé new permet de créer l'objet (instance de la classe en passant des paramètres)
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Afficher l'instruction
        System.out.println("Veuillez saisir le libelle du role à créer");
        String libelle = reader.readLine();

        // créer le role
        RoleService roleService = new RoleService();
        Role role = new Role();
        role.setLibelle(libelle);
        Role roleCree = roleService.create(role);



        System.out.println("Liste de roles");
        RoleService roleService = new RoleService();

        List<Role> roles = roleService.list();
        for (int i = 0; i < roles.size(); i++) {
            System.out.println("Le role " + roles.get(i).getLibelle() + " a pour id " + roles.get(i).getId() );
        }

        for (Role role : roles) {
            System.out.println("Le role " + role.getLibelle() + " a pour id " + role.getId() );
        }


        Role role = roleService.read("GESTIONNAIRE");
        // Afficher le role et son id dans la console
        if( role == null){
            System.out.println("Le role recherché n'existe pas");
        } else if( role.getId() <10)  {
            System.out.println("Le role " + role.getLibelle() + " a pour id " + role.getId() + " qui est indefrieur à 100" );

        } else {
            System.out.println("Le role " + role.getLibelle() + " a pour id " + role.getId() );
        }
    }
}
