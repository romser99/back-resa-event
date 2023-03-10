package fr.solutec.resaevent.principal;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Artiste;
import fr.solutec.resaevent.entites.Lieu;
import fr.solutec.resaevent.services.AdresseService;
import fr.solutec.resaevent.services.ArtisteService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ArtisteService artisteService = new ArtisteService();
        System.out.println("Pour consulter les artistes enregistrés,\n\ttapez 0.\nPour ajouter un artiste,\n\ttapez 1.\nPour modifier les données d'un artiste,\ttapez 2.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String reponse = reader.readLine();
        if (reponse.equals("0")) {
            List<Artiste> artistes = artisteService.read();
            for (Artiste artiste : artistes) {
                System.out.println("Artiste " + artiste.getId() + " : " + artiste.getNom() + " - " + artiste.getGenre());
            }
        }
        else if (reponse.equals("1")) {
            for (int i = 0; i < 1; ++i) {
                Artiste artiste = new Artiste();
                System.out.println("Veuillez saisir le nom de l'artiste.");
                String nomArtiste = reader.readLine();
                artiste.setNom(nomArtiste);

                System.out.println("Veuillez saisir le genre de l'artiste.");
                String genreArtiste = reader.readLine();
                artiste.setGenre(genreArtiste);
            }
        }
        else {
            System.out.println("Mauvaise saisie.");
        }

    }
}

    /*
    public static void main(String[] args) throws IOException {
        /** lire les saisies de l'utilisateur et creer une adresse
         *

        LieuService lieuService = new LieuService();
        List<Lieu> lieux = lieuService.read();
        for (Lieu lieu : lieux) {
            System.out.println(lieu.getNom());
        }
        System.out.println("Veuillez indiquer le lieu");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String idLieu = reader.readLine();
        System.out.println("Veuillez indiquer l'adresse");
        String idAdresse = reader.readLine();
        lieuService.update(Integer.parseInt(idLieu), Integer.parseInt(idAdresse));


        AdresseService adresseService = new AdresseService();
        System.out.println("tapez 1 pour saisir une adresse et 2 pour consulter les adresses");

        String reponse = reader.readLine() ;
        if (reponse.equals("2")) {
            List<Adresse> adresses = adresseService.read() ;
            for (Adresse adresse : adresses){
                System.out.println(adresse.getNumero() +" "+ adresse.getRue() +" "+ adresse.getCodePostal() +" "+ adresse.getVille()) ;
            }
        }
        else if (reponse.equals("1")) {
            for (int i = 0; i < 1; i++){
                Adresse adresse = new Adresse();

                System.out.println("veuillez saisir votre numero");
                String numero = reader.readLine();
                int numeroAsInteger = Integer.parseInt(numero);
                adresse.setNumero(numeroAsInteger);

                System.out.println("veuillez saisir votre rue");
                String rue = reader.readLine();
                adresse.setRue(rue);

                System.out.println("veuillez saisir votre ville");
                String ville = reader.readLine();
                adresse.setVille(ville);

                System.out.println("veuillez saisir votre code postal");
                String codePostal = reader.readLine();
                int codePostAsInteger = Integer.parseInt(codePostal);
                adresse.setCodePostal(codePostAsInteger);

                adresseService.create(adresse);
            }
        }
        else {
            System.out.println("Mauvaise saisie");
        }
    }*/



        // demander le libelle d'un role à l'utilisateur
        /**
         * classe buffered reader
         * objet (instance de classe reader on peut nommer si on veut
         * nom clé permet de creer l'objetinstance del al classe en passant les parametres
         */
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // afficher l'instruction

        System.out.println("veuiller saisir le libelle du role à créer");
        String libelle = reader.readLine();

        RoleService roleService = new RoleService() ;
        Role role = new Role() ;
        role.setLibelle(libelle);
        Role roleCree = roleService.create(role);

        // afficher le role et son id dans la console
        */
        /*
        System.out.println("Liste de roles");
        RoleService roleService = new RoleService();
        /*
        List<Role> roles = roleService.list();
        for (int i = 0; i< roles.size(); i++) {
            System.out.println("Le role " + roles.get(i).getLibelle() + " a pour id " + roles.get(i).getId() );
        }

        for (Role role : roles) {
            System.out.println("Le role " + role.getLibelle() + "a pour id " + role.getId() );
        }

        Role role = roleService.read(GESTIONNAIRE) ;
        if( role == null){
            System.out.println("Le role recherché n'existe pas");

        } else if(role.getId() <100) {
            System.out.println("Le role " + role.getLibelle() + " a pour id " + role.getId() + " qui est inférieur à 100");

        } else {
            System.out.println("Le role " + role.getLibelle() + " a pour id " + role.getId());
        }
    */