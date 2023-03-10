package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Lieu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LieuDAO {
<<<<<<< HEAD
    Connection connection = null;

    public LieuDAO() {
    }

    public void create (Lieu lieu) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            String QUERY = "INSERT INTO LIEU (NOM, PAYS, ADRESSE, REGION, ALIAS) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            preparedStatement.setString(1, lieu.getNom());
            preparedStatement.setString(2, lieu.getPays());
            preparedStatement.setString(3, lieu.getAdresse());
            preparedStatement.setString(4, lieu.getRegion());
            preparedStatement.setString(4, lieu.getAlias());
            preparedStatement.execute();
            this.connection.close();
        } catch (SQLException var5) {
            System.out.println("SQLException: " + var5.getMessage());
            System.out.println("SQLState: " + var5.getSQLState());
            System.out.println("VendorError: " + var5.getErrorCode());
        }
    }

    public List<Lieu> read() {
        List<Lieu> lieux = new ArrayList();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "SELECT * FROM LIEU";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                Lieu lieu = new Lieu();
                lieu.setId(resultSet.getInt(1));
                lieu.setNom(resultSet.getString(2));
                lieu.setPays(resultSet.getString(4));
                lieu.setAdresse(resultSet.getString(3));
                lieu.setRegion(resultSet.getString(5));
                lieu.setAlias(resultSet.getString(5));
                lieux.add(lieu);
            }

            this.connection.close();
        } catch (SQLException var7) {
            System.out.println("SQLException: " + var7.getMessage());
            System.out.println("SQLState: " + var7.getSQLState());
            System.out.println("VendorError: " + var7.getErrorCode());
        }

        return lieux;
=======
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


>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }
}
