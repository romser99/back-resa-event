package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdresseDAO {
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
                Adresse adresse = new Adresse();
                adresse.setId(resultSet.getInt(1));
                adresse.setNumero(resultSet.getInt(2));
                adresse.setCodePostal(resultSet.getInt(4));
                adresse.setRue(resultSet.getString(3));
                adresse.setVille(resultSet.getString(5));

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
    }
}
