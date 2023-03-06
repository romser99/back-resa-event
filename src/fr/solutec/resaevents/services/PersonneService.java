package fr.solutec.resaevents.services;

import fr.solutec.resaevents.entites.Personnes;

public class PersonneService {
    public Personnes create(Personnes personnes) {
        Personnes newpers = new Personnes();
        newpers.setnom(personnes.getnom());
        newpers.setprenom(personnes.getprenom());
        newpers.setmail(personnes.getmail());
        newpers.setmotdepasse(personnes.getmotdepasse());
        newpers.settelephone(personnes.gettelephone());
        newpers.setId(personnes.getId());
        return newpers;
    }
}

