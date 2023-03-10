package fr.solutec.resaevents.services;

import fr.solutec.resaevents.dao.AdresseDAO;
import fr.solutec.resaevents.entites.Adresse;

import java.util.List;

public class AdresseService {

    // Creation d'une instance(objet) de la classe
    /**
     * AdresseDAO => type d'objet
     * adresseDAO => l'objet ou l'instance
     * new AdresseDAO() => création de l'instance
     */
    AdresseDAO adresseDAO = new AdresseDAO();

    /**
     * Création d'une adresse
     * @param adresse
     */
    public void create(Adresse adresse) {
        //Appel de la méthode create qui est dans AdresseDAO
        if (adresse.getRegion() == null) {
            adresse.setRegion("ILE DE FRANCE");
        }
        this.adresseDAO.create(adresse);
    }
    public List<Adresse> read() {
        return this.adresseDAO.read();
    }
}


