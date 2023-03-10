package fr.solutec.resaevent.services;

import fr.solutec.resaevent.dao.AdresseDAO;
import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Role;
import fr.solutec.resaevent.enums.RoleEnum;

import java.util.ArrayList;
import java.util.List;

public class AdresseService {
    //create instance (objet) de la classe
    // AdresseDAO type
    //adresseDAO objet ou instance
    // new AdresseDAO : creation de l'instance
    AdresseDAO adresseDAO = new AdresseDAO();


    public void create(Adresse adresse){
        // appel de la methode create qui est dans AdresseDao
        if (adresse.getRegion() == null) {
            adresse.setRegion("ILE DE FRANCE");
        }
        this.adresseDAO.create(adresse);

    }
    public List<Adresse> read() {
        return this.adresseDAO.read();
    }
}
