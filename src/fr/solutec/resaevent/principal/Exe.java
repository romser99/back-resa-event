package fr.solutec.resaevent.principal;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Lieu;
import fr.solutec.resaevent.services.AdresseService;
import fr.solutec.resaevent.services.LieuService;
import fr.solutec.resaevent.dao.LieuDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Exe {
    public static void main(String[] args) throws IOException {
        AdresseService adresseService = new AdresseService();
        LieuService lieuService = new LieuService();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Lieu> lieuxgene = lieuService.readgene() ;
        List<Adresse> adresses = adresseService.read() ;
        System.out.println("Voici la liste des lieux disponibles");
        for (Lieu Lieu : lieuxgene){
            System.out.println("ID Lieu: "+ Lieu.getId() +" nom : "+ Lieu.getNom()) ;
        }

        System.out.println("Souhaitez vous ajouter un lieu, si oui tapez oui si non tapez non");
        String ajout = reader.readLine();
        // damande si on veut ajouter un lieu
        if (ajout.equals("oui")) {
            //creation du lieu
            for (int i = 0; i < 1; i++){
                Lieu lieu = new Lieu();

                System.out.println("veuillez saisir le nom de l'etablissement");
                String nom = reader.readLine();
                lieu.setNom(nom);
                lieuService.create(lieu);
            }
            System.out.println("Voici la liste des adresses disponibles");

            //check la liste des adresse
            for (Adresse adresse : adresses){
                System.out.println("ID adresse: "+ adresse.getId() +" adresse : "+ adresse.getNumero() +" "+ adresse.getRue() +" "+ adresse.getCodePostal() +" "+ adresse.getVille()) ;
            }

            System.out.println("Si votre adresse n'est pas référencée tapez 1");
            String reponse = reader.readLine();
            //si adresse non ref creation adresse et on montre la nou
            if (reponse.equals("1")) {
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
                System.out.println("Voici la nouvelle liste des adresses disponibles");

                for (Adresse adresse : adresses){
                    System.out.println("ID adresse: "+ adresse.getId() +" adresse : "+ adresse.getNumero() +" "+ adresse.getRue() +" "+ adresse.getCodePostal() +" "+ adresse.getVille()) ;
                }
            }
            else  {

            }
            System.out.println("Voici la nouvelle liste des lieux disponibles");
            for (Lieu Lieu : lieuxgene){
                System.out.println("ID Lieu: "+ Lieu.getId() +" nom : "+ Lieu.getNom()) ;
            }


        }
        else {
            System.out.println("souhaitez vous ajouter une adresse si oui tapez oui ?");
            String nouvelleadresse = reader.readLine();
            if (nouvelleadresse.equals("oui")) {
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
                System.out.println("Voici la nouvelle liste des adresses disponibles");

                for (Adresse adresse : adresses){
                    System.out.println("ID adresse: "+ adresse.getId() +" adresse : "+ adresse.getNumero() +" "+ adresse.getRue() +" "+ adresse.getCodePostal() +" "+ adresse.getVille()) ;
                }

            }
        }
        System.out.println("souhaitez vous lier un lieu a une adresse ? si oui tapez oui");
        String liaison = reader.readLine();

        if (liaison.equals("oui")) {
            System.out.println("saisissez l'id du lieu");
            String idlieu = reader.readLine();
            int idlieuAsInteger = Integer.parseInt(idlieu);

            System.out.println("saisissez l'id de l'adresse");
            String idadresse = reader.readLine();
            int idadresseAsInteger = Integer.parseInt(idadresse);

            lieuService.update(idlieuAsInteger,idadresseAsInteger) ;

        }

        else {

        }










    }
}
