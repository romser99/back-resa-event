package fr.solutec.resaevent.services;

import fr.solutec.resaevent.dao.AdresseDAO;
import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Role;
import fr.solutec.resaevent.enums.RoleEnum;

import java.util.ArrayList;
import java.util.List;

public class AdresseService {

    AdresseDAO adresseDAO = new AdresseDAO();

    public AdresseService() {
    }

    public void create(Adresse adresse) {
        if (adresse.getRegion() == null) {
            adresse.setRegion("ILE DE FRANCE");
        }

        this.adresseDAO.create(adresse);
    }

    public List<Adresse> list() {
        List<Adresse> adresses = new ArrayList<>();
        for (int i=0; i<10; i++){
            Adresse adresse = new Adresse();
            adresse.setId(i);
            adresse.setNumero(Integer.parseInt("NUMERO"+ i));
            adresse.setRue("RUE"+ i);
            adresse.setCodePostal(Integer.parseInt("CODE POSTAL"+ i));
            adresse.setRegion("REGION"+ i);
            adresses.add(adresse);
        }
        return adresses;
    }

    public List<Adresse> read() {
        return this.adresseDAO.read();
    }
}