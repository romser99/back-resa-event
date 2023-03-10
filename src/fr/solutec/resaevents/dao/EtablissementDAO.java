package fr.solutec.resaevents.dao;

import fr.solutec.resaevents.entites.Adresse;
import fr.solutec.resaevents.entites.Etablissement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
public class EtablissementDAO {
    Connection connection = null;
    public void create(Etablissement etablissement) {
        // insert dans la BDD
        try  {
            // protocol//[hosts][/database][?properties]
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=";
            connection = DriverManager.getConnection(CONNECTION_URL);

            // requete
            String QUERY = "INSERT INTO ETABLISSEMENT (NOM) VALUES (?)";

            // Préparation de la requête
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            // Définition des variables
            preparedStatement.setString(1, etablissement.getNom());


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

    public void update (int idEtablissement, int idAdresse) {
        try {

            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);

            String QUERY = "UPDATE ETABLISSEMENT SET id_adresse = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);

            preparedStatement.setInt(1,idAdresse);
            preparedStatement.setInt(2,idEtablissement);

            preparedStatement.execute();

            connection.close();
        }

        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }



    public List<Etablissement> read(int id_adresseAsInteger) {
        List<Etablissement> etablissements = new ArrayList<>();
        // insert dans la BDD
        try  {
            // protocol//[hosts][/database][?properties]
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=";
            connection = DriverManager.getConnection(CONNECTION_URL);

            // requete
            String QUERY = "SELECT * FROM ETABLISSEMENT e JOIN ADRESSE a ON e.ID_Adresse=a.ID WHERE e.ID=?";

            // Préparation de la requête
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1,id_adresseAsInteger);

            // Eécution de la requête
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Adresse adresse = new Adresse();
                adresse.setId(resultSet.getInt(4));
                adresse.setNumero(resultSet.getInt(5));
                adresse.setRue(resultSet.getString(6));
                adresse.setCodePostal(resultSet.getInt(7));
                adresse.setVille(resultSet.getString(8));

                Etablissement etablissement = new Etablissement();
                etablissement.setAdresse(adresse);
                etablissement.setId(resultSet.getInt(1));
                etablissement.setNom(resultSet.getString(2));

                etablissements.add(etablissement);
            }

            // Fermeture connexion
            connection.close();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return etablissements;
    }
}