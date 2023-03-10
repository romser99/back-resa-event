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
            String QUERY = "INSERT INTO LIEU(NUMERO) VALUES(?)";

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
    public List<Lieu> read() {
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
                Lieu lieu = new lieu();
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

    public void update (int idLieu, int idAdresse) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "UPDATE LIEU SET ADRESSE_ID = ? WHERE ID ?";
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setInt(1,idAdresse);
            preparedStatement.setInt(2,idLieu);

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }


    }
}
