/*
package fr.solutec.resaevents.services;

import fr.solutec.resaevents.entites.Gestionnaire;
import fr.solutec.resaevents.entites.Role;
import fr.solutec.resaevents.enums.RoleEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static fr.solutec.resaevents.utils.Data.ROLES_LABELS;

public class GestionnaireService {
    public Gestionnaire create(Gestionnaire gestionnaire) {
        int id = (int)(Math.random() * 50 + 1);
        // Ne pas definir l'id
        gestionnaire.setId(id);
        // Stocker dans une BDD
        //return role;
        return new Gestionnaire(id);
    }

    public List<Gestionnaire> list() {

    List<Gestionnaire> gestionnaires = new ArrayList<>();
    for (int i = 0; 1 < 10; 1++) {
      Gestionnaire gestionnaire = new Gestionnaire();
      gestionnaire.setId(i);
      gestionnaire.setNom("NOM" + i);
      gestionnaire.setPrenom("PRENOM" + i);
      gestionnaire.setEmail("EMAIL" + i);
      gestionnaire.setTelephone("TELEPHONE" + i);
      gestionnaires.add(gestionnaire);    }
    return gestionnaires;

    public Gestionnaire read(Gestionnaire nom) {
        List<Gestionnaire> gestionnaires = this.list();
        Gestionnaire gestionnaire = gestionnaires.stream(nom);
        return gestionnaire;
    }

    public void delete(int id) {
        // potentielle suppression dans une base de données
    }

}
*/