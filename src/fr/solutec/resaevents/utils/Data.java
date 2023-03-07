package fr.solutec.resaevents.utils;

import fr.solutec.resaevents.enums.RoleEnum;

import static fr.solutec.resaevents.enums.RoleEnum.ADMIN;
import static fr.solutec.resaevents.enums.RoleEnum.GESTIONNAIRE;
import static fr.solutec.resaevents.enums.RoleEnum.UTILISATEUR;

public class Data {

    public static RoleEnum[] ROLES_LABELS = {ADMIN, UTILISATEUR, GESTIONNAIRE};
    public static String[] CIVILITES = {"MR", "MME", "MLLE", "MR"};
    public static String[] GENRE = {"MASCULIN", "FEMININ"};
}
