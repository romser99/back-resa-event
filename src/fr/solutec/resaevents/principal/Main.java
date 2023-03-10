package fr.solutec.resaevents.principal;

import fr.solutec.resaevents.entites.Etablissement;
import fr.solutec.resaevents.services.EtablissementService;
import fr.solutec.resaevents.entites.Adresse;
import fr.solutec.resaevents.services.AdresseService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Sur quelle entités voulez vous travailler ?");
        System.out.println("1 - Adresse");
        System.out.println("2 - Etablissement");
        System.out.println("3 - Salles");
        System.out.println("4 - Places");
        System.out.println("5 - Artistes");
        System.out.println("6 - Types");
        System.out.println("7 - Evenements");
        System.out.println("8 - Agendas");
        System.out.println("9 - Reservations");
        System.out.println("10 - QRCodes");
        System.out.println("11 - Personnes");
        System.out.println("12 - Roles");
        System.out.println("13 - Equipes");
        System.out.println("14 - Clients");
        System.out.println("15 - Gestionnaires");
        String condition = reader.readLine();
        int conditionAsInteger = Integer.parseInt(condition);

        if (conditionAsInteger == 1) {

            System.out.println("Quelle action voulez vous effectuer sur la base de données ?");
            System.out.println("1 - Insertion");
            System.out.println("2 - Affichage");
            System.out.println("3 - Suppression");
            String condition1 = reader.readLine();
            int condition1AsInteger = Integer.parseInt(condition1);

            if (condition1AsInteger == 1) {

                Adresse adresse = new Adresse();

                System.out.println("Veuillez saisir Numéro de Rue");
                String numero = reader.readLine();

                int numeroAsInteger = Integer.parseInt(numero);
                adresse.setNumero(numeroAsInteger);

                System.out.println("Veuillez saisir Rue");
                String rue = reader.readLine();
                adresse.setRue(rue);

                System.out.println("Veuillez saisir Ville");
                String ville = reader.readLine();
                adresse.setVille(ville);

                System.out.println("Veuillez saisir Code Postal");
                String codePostal = reader.readLine();

                int codePostalAsInteger = Integer.parseInt(codePostal);
                adresse.setCodePostal(codePostalAsInteger);

                AdresseService adresseService = new AdresseService();
                adresseService.create(adresse);

            }

              else if (condition1AsInteger == 2) {

                AdresseService adresseService = new AdresseService();

                List<Adresse> adresses = adresseService.read();
                for (Adresse alladresses : adresses) {
                  System.out.println(alladresses.getNumero() + " " + alladresses.getRue() + " " + alladresses.getVille() + " " + alladresses.getCodePostal() + " ");
                }
            }
        }

        if (conditionAsInteger == 2) {

            System.out.println("Quelle action voulez vous effectuer sur la base de données ?");
            System.out.println("1 - Insertion");
            System.out.println("2 - Mise à jour FK");
            System.out.println("3 - Affichage");
            System.out.println("4 - Suppression");
            String condition2 = reader.readLine();
            int condition2AsInteger = Integer.parseInt(condition2);

            if (condition2AsInteger == 1) {

                Etablissement etablissement = new Etablissement();


                System.out.println("Veuillez saisir Nom de l'Etablissement");
                String nom = reader.readLine();
                etablissement.setNom(nom);

                EtablissementService etablissementService = new EtablissementService();
                etablissementService.create(etablissement);

            }

            else if (condition2AsInteger == 2) {

                Etablissement etablissement = new Etablissement();

                System.out.println("Veuillez indiquer l'id de l'etablissement'");
                String idEtablissement = reader.readLine();
                System.out.println("Veuillez indiquer l'id de l'adresse qui lui sera jointe");
                String idAdresse = reader.readLine();

                EtablissementService etablissementService = new EtablissementService();
                etablissementService.update(Integer.parseInt(idEtablissement), Integer.parseInt(idAdresse));

            }

            else if (condition2AsInteger == 3) {

                System.out.println("Veuillez saisir l'id de l'etablissement à afficher");
                String id_etablissement = reader.readLine();

                int id_etablissementAsInteger = Integer.parseInt(id_etablissement);

                EtablissementService etablissementService = new EtablissementService();

                List<Etablissement> etablissements = etablissementService.read(id_etablissementAsInteger);
                for (Etablissement alletablissement : etablissements) {
                    System.out.println(alletablissement.getId() + " " + alletablissement.getNom() + " " + alletablissement.getAdresse().getId() + " " +
                            alletablissement.getAdresse().getNumero() + " " + alletablissement.getAdresse().getRue() + " " + alletablissement.getAdresse().getCodePostal() + " "
                            + alletablissement.getAdresse().getVille() + " ");
                }
            }
        }








        /* Lire les saisies du user et créer une adresse
        */
    }
}










        /*
        // Demander le libelle d'un role à l'utilisateur
         * - Classe BufferedReader
         * - Objet(Instance de classe) reader (On peut nomme on veut)
         * - mon clé new permet de créer l'objet (instance de la classe en passant des paramètres)

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
        */
