package model;

import java.sql.*;

public class DAO {
    protected final String DB_URL = "jdbc:mysql://localhost:3306/RPG_SIM";
    protected final String DB_USER = "bthouverez";
    protected final String DB_PASS = "321654";
    protected Connection connection;
    protected ResultSet results;

    public DAO() {
        this.connection = null;
        this.results = null;

        System.out.println("Connexion à la base de données");
        try {
            this.connection = DriverManager.getConnection(this.DB_URL, this.DB_USER, this.DB_PASS);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println("Connexion à la base de données impossible");
        }
        System.out.println("Connexion réussie");
    }

}
