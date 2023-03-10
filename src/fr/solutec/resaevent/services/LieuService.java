package fr.solutec.resaevent.services;

import fr.solutec.resaevent.dao.LieuDAO;
import fr.solutec.resaevent.entites.Lieu;


import java.util.List;

public class LieuService {
    LieuDAO lieuDAO = new LieuDAO() ;

    public void create(Lieu lieu){
        // appel de la methode create qui est dans AdresseDao
        this.lieuDAO.create(lieu);

    }
    public List<Lieu> read(int id) {
        return this.lieuDAO.read(id);
    }
    public List<Lieu> readgene() {
        return this.lieuDAO.readgene();
    }

    public void update(int idlieu, int idadresse) {
        this.lieuDAO.update(idlieu, idadresse);
    }
}
