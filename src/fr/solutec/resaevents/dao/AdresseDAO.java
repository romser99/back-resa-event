package fr.solutec.resaevents.dao;

import fr.solutec.resaevents.entites.Adresse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
public class AdresseDAO {
    Connection connection = null;
    public void create(Adresse adresse) {
        // insert dans la BDD
        try  {
            // protocol//[hosts][/database][?properties]
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=";
            connection = DriverManager.getConnection(CONNECTION_URL);

            // requete
            String QUERY = "INSERT INTO ADRESSE (NUMERO, RUE, CODE_POSTAL, VILLE) VALUES (?, ?, ?, ?)";

            // Préparation de la requête
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            // Définition des variables
            preparedStatement.setInt(1, adresse.getNumero());
            preparedStatement.setString(2, adresse.getRue());
            preparedStatement.setInt(3, adresse.getCodePostal());
            preparedStatement.setString(4, adresse.getVille());

            // Eécution de la requête
            preparedStatement.execute();

            // Fermeture connexion
            connection.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public List<Adresse> read() {
        List<Adresse> adresses = new ArrayList<>();
        // insert dans la BDD
        try  {
            // protocol//[hosts][/database][?properties]
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=";
            connection = DriverManager.getConnection(CONNECTION_URL);

            // requete
            String QUERY = "SELECT * FROM ADRESSE";

            // Préparation de la requête
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);

            // Exécution de la requête
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Adresse adresse = new Adresse();
                adresse.setId(resultSet.getInt(1));
                adresse.setNumero(resultSet.getInt(2));
                adresse.setRue(resultSet.getString(3));
                adresse.setCodePostal(resultSet.getInt(4));
                adresse.setVille(resultSet.getString(5));

                adresses.add(adresse);
            }

            // Fermeture connexion
            connection.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return adresses;
    }
}
