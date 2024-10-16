import model.CharacterDAO;
import model.DAO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CharacterDAO dao = new CharacterDAO();
        ArrayList<String> stats = dao.getByLabel("Warrior");
        for(String e : stats) {
            System.out.println(e);
        }
    }
}