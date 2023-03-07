package fr.solutec.resaevents.entites;

/*
Une classe abstraite est une classe qu'on ne peut instancier, on ne peut faire de new
il faut hériter de la classe pour instancier cette dernière
 */
public class Personne {
    private int id;
    private String prenom;
    private String nom;
    private String email;
    private String telephone;
    private String password;
    private Role role;

    protected Personne() {
    }

    protected Personne(String prenom, String nom, String email, String telephone, String password, Role role) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.role = role;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getPrenom() {
        return prenom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected String getNom() {
        return nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getTelephone() {
        return telephone;
    }

    protected void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected String getPassword() {
        return password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected Role getRole() {
        return role;
    }

    protected void setRole(Role role) {
        this.role = role;
    }
}
