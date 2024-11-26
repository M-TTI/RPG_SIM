package model;

import java.io.IOException;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CharacterDAO extends DAO {

    public CharacterDAO() throws IOException {
        super();
    }

    /**
     * Récupère les données d'un type de personnage selon son name
     * @param name type de personnage dont on veut les caractéristiques
     * @return un tableau de String contenant toutes les caractéristiques
     */
    public ArrayList<String> getByName(String name) {
        ArrayList<String> resp = new ArrayList<>();
        //creation et execution de la requete
        System.out.println("Creation et execution de la requête");
        String query = "SELECT * FROM Characters WHERE name = '" + name + "'";

        try {
            Statement stmt = this.connection.createStatement();
            this.results = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.err.println("Anomalie lors de l'execution de la requête");
        }

        //parcours des données retournées
        System.out.println("Parcours des données retournées");
        try {
            ResultSetMetaData rsmd = this.results.getMetaData();
            int nbCols = rsmd.getColumnCount();
            boolean encore = this.results.next();
            while (encore) {
                for (int i = 1; i <= nbCols; i++){
                    resp.add(this.results.getString(i));
                }
                encore = this.results.next();
            }

            this.results.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return resp;
    }
}
