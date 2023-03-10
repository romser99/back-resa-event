package fr.solutec.resaevent.services;

import fr.solutec.resaevent.dao.ArtisteDAO;
import fr.solutec.resaevent.entites.Artiste;

import java.util.List;

public class ArtisteService {
    ArtisteDAO artisteDAO = new ArtisteDAO();

    public ArtisteService() {
    }

    public void create (Artiste artiste) {
        this.artisteDAO.create(artiste);
    }

    public List<Artiste> read() {
        return this.artisteDAO.read();
    }

    public void update(int id, String nom, String genre) {
        this.artisteDAO.update(id, nom, genre);
    }
}
