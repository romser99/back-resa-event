package fr.solutec.resaevent.entites;

public class Adresse {
<<<<<<< HEAD
    private int id;
    private int numero;
    private String rue;
    private int codePostal;
    private String ville;
    private String region;
    private String pays;

    public Adresse() {
=======
    private int id ;
    private int numero ;
    private String rue ;
    private int codePostal ;
    private String ville ;
    private String region ;
    private String pays ;

    public Adresse(){

>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public Adresse(int id, int numero, String rue, int codePostal, String ville, String region, String pays) {
        this.id = id;
        this.numero = numero;
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.region = region;
        this.pays = pays;
    }

    public int getId() {
<<<<<<< HEAD
        return this.id;
=======
        return id;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
<<<<<<< HEAD
        return this.numero;
=======
        return numero;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
<<<<<<< HEAD
        return this.rue;
=======
        return rue;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePostal() {
<<<<<<< HEAD
        return this.codePostal;
=======
        return codePostal;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
<<<<<<< HEAD
        return this.ville;
=======
        return ville;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
<<<<<<< HEAD
        return this.region;
=======
        return region;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPays() {
<<<<<<< HEAD
        return this.pays;
=======
        return pays;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
