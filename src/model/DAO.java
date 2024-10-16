package model;

import utilities.EnvReader;

import java.io.IOException;
import java.sql.*;

public class DAO {
    protected final String DB_URL;
    protected final String DB_USER;
    protected final String DB_PASS;
    protected Connection connection;
    protected ResultSet results;

    public DAO() throws IOException {
        EnvReader env = new EnvReader();
        env.load();
        this.DB_URL = env.get("DB_URL");
        this.DB_USER = env.get("DB_USER");
        this.DB_PASS = env.get("DB_PASS");
        System.out.println(this.DB_URL);
        System.out.println(this.DB_USER);
        System.out.println(this.DB_PASS);

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
