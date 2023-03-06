package fr.solutec.resaevents.principal;
import fr.solutec.resaevents.entites.Role;
import fr.solutec.resaevents.services.RoleService;
import fr.solutec.resaevents.entites.Clients;
import fr.solutec.resaevents.services.ClientService;
import fr.solutec.resaevents.entites.Personnes;
import fr.solutec.resaevents.services.PersonneService;
public class Main {
    public static void main(String[] args) {
       RoleService roleService = new RoleService();

       Role admin = new Role();
       admin.setLibelle("ADMIN");
       admin.setId(1);
       Role resultat = roleService.create(admin);
       roleService.display(resultat);

       Role user = new Role();
       user.setLibelle("USER");
       user.setId(2);
       resultat = roleService.create(user);
       roleService.display(resultat);

       ClientService clientService = new ClientService();

       Clients clients = new Clients ();
       clients.setLibelle("CLIENT");
       clients.setId(1);
       clients.setnom("Dupond");
       clients.setprenom("Jean" +
               "");
       Clients donnees = clientService.create(clients);
       clientService.display(donnees);
    }
}