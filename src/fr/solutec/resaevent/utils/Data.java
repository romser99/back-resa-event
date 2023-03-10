package fr.solutec.resaevent.utils;

import fr.solutec.resaevent.enums.RoleEnum;

public class Data {
    public static RoleEnum[] ROLES_LABELS;
    public static String[] CIVILITES;
    public static String[] GENRE;

    public Data() {
    }

    static {
        ROLES_LABELS = new RoleEnum[]{RoleEnum.ADMIN, RoleEnum.UTILISATEUR, RoleEnum.GESTIONNAIRE};
        CIVILITES = new String[]{"MR", "MME", "MLLE", "MR"};
        GENRE = new String[]{"MASCULIN", "FEMININ"};
    }
}
