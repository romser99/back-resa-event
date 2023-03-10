package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Lieu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LieuDAO {
    Connection connection = null ;
    public void create(Lieu lieu) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            //requete
            String QUERY = "INSERT INTO LIEU(nom) VALUES(?)";

            //preparation requete
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            //preparation variables
            preparedStatement.setString(1,lieu.getNom());
            //execution
            preparedStatement.execute();
            //fermeture
            connection.close();


            /// insert dans la BDD
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
    public List<Lieu> read(int idjoin) {
        List<Lieu> lieux = new ArrayList<>();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            //requete
            String QUERY = "SELECT * FROM LIEU l JOIN ADRESSE a ON l.adresse_id = a.id WHERE l.id = ?";
            //preparation requete
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1,idjoin);
            //execution
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Adresse adresse = new Adresse();
                Lieu lieu = new Lieu();
                adresse.setId(resultSet.getInt(4));
                adresse.setNumero(resultSet.getInt(5));
                adresse.setCodePostal(resultSet.getInt(7));
                adresse.setRue(resultSet.getString(6));
                adresse.setVille(resultSet.getString(8));
                lieu.setId(resultSet.getInt(1));
                lieu.setNom(resultSet.getString(2));
                lieu.setAdresse(adresse);


                lieux.add(lieu);
            }
            //fermeture
            connection.close();


            /// insert dans la BDD
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return lieux ;
        //lecture
        //mise a jour
        //supression
    }

    public void update (int idLieu, int idAdresse) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "UPDATE LIEU SET adresse_id = ? WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1,idAdresse);
            preparedStatement.setInt(2,idLieu);
            preparedStatement.execute();

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }


    }
    public List<Lieu> readgene() {
        List<Lieu> lieux = new ArrayList<>();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            //requete
            String QUERY = "SELECT * FROM LIEU";
            //preparation requete
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            //execution
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Adresse adresse = new Adresse();
                Lieu lieu = new Lieu();
                lieu.setId(resultSet.getInt(1));
                lieu.setNom(resultSet.getString(2));



                lieux.add(lieu);
            }
            //fermeture
            connection.close();


            /// insert dans la BDD
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return lieux ;
        //lecture
        //mise a jour
        //supression
    }
}
