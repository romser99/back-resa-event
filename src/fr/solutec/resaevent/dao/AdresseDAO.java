package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdresseDAO {
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
                Adresse adresse = new Adresse();
                adresse.setId(resultSet.getInt(1));
                adresse.setNumero(resultSet.getInt(2));
                adresse.setCodePostal(resultSet.getInt(4));
                adresse.setRue(resultSet.getString(3));
                adresse.setVille(resultSet.getString(5));
                adresses.add(adresse);
            }

            this.connection.close();
        } catch (SQLException var7) {
            System.out.println("SQLException: " + var7.getMessage());
            System.out.println("SQLState: " + var7.getSQLState());
            System.out.println("VendorError: " + var7.getErrorCode());
        }

        return adresses;
    }
}
