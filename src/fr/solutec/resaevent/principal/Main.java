package fr.solutec.resaevent.principal;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.services.AdresseService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        AdresseService adresseService = new AdresseService();
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Quelle action souhaitez-vous effectuer ?\n\t-Pour lister les adresses, tapez 1.\n\t-Pour créer une nouvelle adresse, tapez 2.");
        String action = choice.readLine();
        int actionAsInteger = Integer.parseInt(action);
        if (actionAsInteger == 2) {
            List<Adresse> adresses = adresseService.read();
            for (Adresse adresse : adresses) {
                System.out.println(adresse.getNumero() + " " + adresse.getRue() + " " + adresse.getCodePostal() + " " + adresse.getVille());
            }
        } else if (actionAsInteger == 1) {
            Adresse adresse = new Adresse();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Veuillez saisir votre numero");
            String numero = reader.readLine();
            int numeroAsInteger = Integer.parseInt(numero);
            adresse.setNumero(numeroAsInteger);
            System.out.println("Veuillez saisir votre rue");
            String rue = reader.readLine();
            adresse.setRue(rue);
            System.out.println("Veuillez saisir votre ville");
            String ville = reader.readLine();
            adresse.setVille(ville);
            System.out.println("Veuillez saisir votre code postal");
            String codePostal = reader.readLine();
            int codePostAsInteger = Integer.parseInt(codePostal);
            adresse.setCodePostal(codePostAsInteger);
            // Créer une adresse
            adresseService.create(adresse);
        } else {
            System.out.println("Veuillez saisir un numéro entre 1 et 2");
        }
    }
}
