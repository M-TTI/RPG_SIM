
import java.util.Scanner;
import model.CharacterDAO;
import utilities.EnvReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
  
public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        CharacterDAO dao = new CharacterDAO();

        System.out.println(dao.getByLabel("Warrior"));


        Character char1 = new Character();
        Character char2 = new Character();

        ArrayList<Character> char_turn = new ArrayList<>();

        if(char1.getWeapon().getSpeed() > char2.getWeapon().getSpeed())
        {
            char_turn.add(char1);
            char_turn.add(char2);
        }else
        {
            char_turn.add(char2);
            char_turn.add(char1);
        }

        boolean loop = true;
        int i = 0;
        while(loop)
        {
            if(char_turn.get(0).getCurrent_hp() < 0){
                System.out.println("Le combat est terminé. "+char_turn.get(0).getName()+"a été tué.");
                loop = false;

            } else if (char_turn.get(1).getCurrent_hp() < 0) {
                System.out.println("Le combat est terminé. "+char_turn.get(1).getName()+"a été tué.");
                loop = false;

            } else{
                System.out.println("C'est le tour de "+char_turn.get(i).getName());
                System.out.println("Vos skill sont: "+
                        char_turn.get(i).getWeapon().getSkill(1).getName()+" et "+
                        char_turn.get(i).getWeapon().getSkill(2).getName()+" lequel voulez vous lancer ?(1)(2)");
                int number = scanner.nextInt();

                double dmg = char_turn.get(i).cast_skill(char_turn.get(1).getWeapon().getSkill(number));
                char_turn.get((i+1)%2).receive_skill(dmg);

                i = (i +1) %2 ;
            }
        }

/*
        System.out.println("Hello world!");
        CharacterDAO dao = new CharacterDAO();
        ArrayList<String> stats = dao.getByLabel("Warrior");
        for(String e : stats) {
            System.out.println(e);
        }
*/


    }
}