package fr.solutec.resaevent.entites;

public class Participation {
    private int id;
    private int id_evenement;
    private int id_artiste;

    public Participation() {
    }

    public Participation(int id, int id_evenement, int id_artiste) {
        this.id = id;
        this.id_evenement = id_evenement;
        this.id_artiste = id_artiste;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getId_evenement() { return id_evenement; }
    public void setId_evenement(int id_evenement) { this.id_evenement = id_evenement; }
    public int getId_artiste() { return id_artiste; }
    public void setId_artiste(int id_artiste) { this.id_artiste = id_artiste; }
}
