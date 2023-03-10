package fr.solutec.resaevent.entites;

<<<<<<< HEAD
public class Lieu {
    private int id;
    private String nom;
    private String pays;
    private String adresse;
    private String region;
    private String alias;
    private int adresse_id;

    public Lieu() {
    }

    public Lieu(int id, String nom, String pays, String adresse, String region, String alias, int adresse_id) {
        this.id = id;
        this.nom = nom;
        this.pays = pays;
        this.adresse = adresse;
        this.region = region;
        this.alias = alias;
        this.adresse_id = adresse_id;
    }

=======
public class Lieu extends Adresse {
    private int id ;
    public String nom ;

    public Lieu(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Lieu(int id, int numero, String rue, int codePostal, String ville, String region, String pays, int id1, String nom) {
        super(id, numero, rue, codePostal, ville, region, pays);
        this.id = id1;
        this.nom = nom;
    }

    public Lieu() {

    }

    @Override
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    public int getId() {
        return id;
    }

<<<<<<< HEAD
=======
    @Override
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

<<<<<<< HEAD
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getAdresse_id() {
        return adresse_id;
    }

    public void setAdresse_id(int adresse_id) {
        this.adresse_id = adresse_id;
    }
}
=======
}
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
