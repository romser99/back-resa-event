package fr.solutec.resaevent.services;

import fr.solutec.resaevent.entites.Participation;

import java.util.List;

public class ParticipationService {
    ParticipationDAO participationDAO = new ParticipationDAO();

    public ParticipationService() {
    }

    public void create (Participation participation) {
        this.participationDAO.create(participation);
    }

    public List<Participation> read() {
        return this.participationDAO.read();
    }

    public void update(int id, int id_evenement, int id_artiste) {
        this.participationDAO.update(id, id_evenement, id_artiste);
    }
}
