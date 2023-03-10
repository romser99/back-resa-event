package fr.solutec.resaevents.services;

import fr.solutec.resaevents.dao.EtablissementDAO;
import fr.solutec.resaevents.entites.Adresse;
import fr.solutec.resaevents.entites.Etablissement;

import java.util.List;

public class EtablissementService {

    // Creation d'une instance(objet) de la classe
    EtablissementDAO etablissementDAO = new EtablissementDAO();

    public void create(Etablissement etablissement) {
        this.etablissementDAO.create(etablissement);
    }

    public void update(int idEtablissement, int idAdresse) {
        this.etablissementDAO.update(idEtablissement, idAdresse);
    }

    public List<Etablissement> read(int id_adresseAsInteger) {
        return this.etablissementDAO.read(id_adresseAsInteger);
    }
}