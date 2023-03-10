package fr.solutec.resaevent.dao;

import fr.solutec.resaevent.entites.Adresse;
import fr.solutec.resaevent.entites.Lieu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LieuDAO {
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
    }
}
