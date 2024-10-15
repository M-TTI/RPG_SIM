package database;

import java.sql.*;

public class DAO {

        private static void affiche(String message) {
            System.out.println(message);
        }

        private static void arret(String message) {
            System.err.println(message);
            System.exit(99);
        }

        public static void run() {
            Connection con = null;
            ResultSet resultats = null;
            String requete = "";

            // chargement du pilote
//            try {
//                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//            } catch (ClassNotFoundException e) {
//                arret("Impossible de charger le pilote jdbc:odbc");
//            }

            //connection a la base de données

            affiche("connexion a la base de données");
            try {

                String DBurl = "jdbc:odbc:RPG_SIM";
                con = DriverManager.getConnection(DBurl);
            } catch (SQLException e) {
                arret(e.getMessage());
                arret("Connection à la base de données impossible");
            }

            //insertion d'un enregistrement dans la table client
            affiche("Creation enregistrement");

            requete = "INSERT INTO client VALUES (3,'client 3','prenom 3')";
            try {
                Statement stmt = con.createStatement();
                int nbMaj = stmt.executeUpdate(requete);
                affiche("Nb mise a jour = "+nbMaj);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            //creation et execution de la requete
            affiche("Creation et execution de la requête");
            requete = "SELECT * FROM client";

            try {
                Statement stmt = con.createStatement();
                resultats = stmt.executeQuery(requete);
            } catch (SQLException e) {
                arret("Anomalie lors de l'execution de la requête");
            }

            //parcours des données retournées
            affiche("Parcours des données retournées");
            try {
                ResultSetMetaData rsmd = resultats.getMetaData();
                int nbCols = rsmd.getColumnCount();
                boolean encore = resultats.next();

                while (encore) {

                    for (int i = 1; i <= nbCols; i++)
                        System.out.print(resultats.getString(i) + " ");
                    System.out.println();
                    encore = resultats.next();
                }

                resultats.close();
            } catch (SQLException e) {
                arret(e.getMessage());
            }
        }
}
