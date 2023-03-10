package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Artiste;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtisteDAO {
    Connection connection = null;

    public ArtisteDAO() {
    }

    public void create(Artiste artiste) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "INSERT INTO ARTISTE (nom, genre) VALUES (?, ?)";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            preparedStatement.setString(2, artiste.getNom());
            preparedStatement.setString(3, artiste.getGenre());
            preparedStatement.execute();
            this.connection.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public List<Artiste> read() {
        List<Artiste> artistes = new ArrayList<>();
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "SELECT * FROM ARTISTE";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Artiste artiste = new Artiste();
                artiste.setId(resultSet.getInt(1));
                artiste.setNom(resultSet.getString(2));
                artiste.setGenre(resultSet.getString(3));
                artistes.add(artiste);
            }
            this.connection.close();
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return artistes;
    }

    public void update (int id, String nom, String genre) {
        try {
            String CONNECTION_URL = "jdbc:mysql://localhost/RESAEVENTS?user=root&password=";
            this.connection = DriverManager.getConnection(CONNECTION_URL);
            String QUERY = "UPDATE ARTISTE WHERE id = ?";
            PreparedStatement preparedStatement = this.connection.prepareStatement(QUERY);
            preparedStatement.setString(2, nom);
            preparedStatement.setString(3, genre);
            preparedStatement.execute();
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
