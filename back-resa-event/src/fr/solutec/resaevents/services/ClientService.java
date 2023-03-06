package fr.solutec.resaevents.services;
import fr.solutec.resaevents.entites.Personnes;
import fr.solutec.resaevents.entites.Clients;
public class ClientService extends PersonneService{
    public Clients create(Clients clients) {
        Clients newclient = clients;
        newclient.setLibelle(clients.getLibelle());
        newclient.setId(clients.getId());
        return newclient;
    }

    public void display(Clients clients) {
        System.out.println("Le " + clients.getLibelle() + " s'appelle " + clients.getnom() + " " + clients.getprenom() + ", il a l'id " + clients.getId());
    }
}
