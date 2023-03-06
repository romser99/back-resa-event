package fr.solutec.resaevents.services;

import fr.solutec.resaevents.entites.Gestionnaires;

public class GestionnaireService {
    public Gestionnaires create(Gestionnaires gestionnaires) {
        Gestionnaires newgestionaire = new Gestionnaires();
        newgestionaire.setLibelle(gestionnaires.getLibelle());
        newgestionaire.setId(gestionnaires.getId());
        return newgestionaire;
    }

    public void display(Gestionnaires gestionnaires) {
        System.out.println("le gestionnaire " + gestionnaires.getLibelle());
    }
}
