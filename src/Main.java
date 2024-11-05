import model.CharacterDAO;
import utilities.EnvReader;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        CharacterDAO dao = new CharacterDAO();
        ArrayList<String> stats = dao.getByLabel("Warrior");
        for(String e : stats) {
            System.out.println(e);
        }


//        EnvReader env = new EnvReader();
//        try {
//            env.load();
//            System.out.println(env);
//        } catch (IOException e) {
//            System.err.println("Erreur lors de la lecture du fichier : " + e.getMessage());
//        }

    }
}