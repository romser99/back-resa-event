package fr.solutec.resaevent.entites;

public abstract class Personne {
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

    protected String getPrenom() {
        return this.prenom;
    }

    protected void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    protected String getNom() {
        return this.nom;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected String getEmail() {
        return this.email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getTelephone() {
        return this.telephone;
    }

    protected void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    protected String getPassword() {
        return this.password;
    }

    protected void setPassword(String password) {
        this.password = password;
    }

    protected Role getRole() {
        return this.role;
    }

    protected void setRole(Role role) {
        this.role = role;
    }
}
