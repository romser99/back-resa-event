package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;
<<<<<<< HEAD
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
=======

import java.sql.*;
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
import java.util.ArrayList;
import java.util.List;

public class AdresseDAO {
<<<<<<< HEAD
    Connection connection = null;

    public AdresseDAO() {
    }

    public void create(Adresse adresse) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "INSERT INTO ADRESSE (NUMERO, RUE, CODE_POSTAL, VILLE) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            preparedStatement.setInt(1, adresse.getNumero());
            preparedStatement.setString(2, adresse.getRue());
            preparedStatement.setInt(3, adresse.getCodePostal());
            preparedStatement.setString(4, adresse.getVille());
            preparedStatement.execute();
            this.connection.close();
        } catch (SQLException var5) {
            System.out.println("SQLException: " + var5.getMessage());
            System.out.println("SQLState: " + var5.getSQLState());
            System.out.println("VendorError: " + var5.getErrorCode());
        }
    }

    public List<Adresse> read() {
        List<Adresse> adresses = new ArrayList();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "SELECT * FROM ADRESSE";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
=======
    Connection connection = null ;//creation

    public void create(Adresse adresse) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            //requete
            String QUERY = "INSERT INTO ADRESSE(NUMERO, RUE, CODE_POSTAL, VILLE) VALUES(?,?,?,?)";

            //preparation requete
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            //preparation variables
            preparedStatement.setInt(1,adresse.getNumero());
            preparedStatement.setString(2,adresse.getRue());
            preparedStatement.setInt(3,adresse.getCodePostal());
            preparedStatement.setString(4,adresse.getVille());
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
    //lecture
    //mise a jour
    //supression
    }
    public List<Adresse> read() {
        List<Adresse> adresses = new ArrayList<>();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost:3306/RESAEVENTS?user=root&password=" ;
            connection = DriverManager.getConnection(CONNECTION_URL);
            //requete
            String QUERY = "SELECT * FROM ADRESSE";
            //preparation requete
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            //execution
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
                Adresse adresse = new Adresse();
                adresse.setId(resultSet.getInt(1));
                adresse.setNumero(resultSet.getInt(2));
                adresse.setCodePostal(resultSet.getInt(4));
                adresse.setRue(resultSet.getString(3));
                adresse.setVille(resultSet.getString(5));
<<<<<<< HEAD
                adresses.add(adresse);
            }

            this.connection.close();
        } catch (SQLException var7) {
            System.out.println("SQLException: " + var7.getMessage());
            System.out.println("SQLState: " + var7.getSQLState());
            System.out.println("VendorError: " + var7.getErrorCode());
        }

        return adresses;
=======

                adresses.add(adresse);
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
        return adresses ;
        //lecture
        //mise a jour
        //supression
>>>>>>> 2e3fc6d40c7b3a609b4f335ea367e9d3882e468c
    }
}
