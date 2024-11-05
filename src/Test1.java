public class Test1 {
    public static void main(String[] args) {

        Skill skill1 = new Skill(1, "fireball", 20.0);
        Skill skill2 = new Skill(2, "frostbolt", 15.0);
        Weapon weapon1 = new Weapon(1, "staff", 10, skill1, skill2);
        Character char1 = new Character(1, "Philiphe", 200.0, 10, 7.5, weapon1);

        Skill skill3 = new Skill(3, "slash", 10.0);
        Skill skill4 = new Skill(4, "rupture", 25.0);
        Weapon weapon2 = new Weapon(2, "polearm", 11, skill1, skill2);
        Character char2 = new Character(2, "José", 190.0, 14, 12.5, weapon2);

        if (char1.getWeapon().getSpeed() > char2.getWeapon().getSpeed()) {
            System.out.println(char1.getName() + " commence.");
            double dmg = char1.cast_skill(char1.getWeapon().getSkill1());
            System.out.println(char2.getName() + " va recevoir " + dmg + " pt de degat et a " + char2.getCurrent_hp() + " pv");
            char2.receive_skill(dmg);
            System.out.println(char2.getName() + " a " + char2.getCurrent_hp() + " pv");
        } else {
            System.out.println(char2.getName() + " commence.");
            double dmg = char2.cast_skill(char2.getWeapon().getSkill1());
            System.out.println(char1.getName() + " va recevoir " + dmg + " pt de degat et a " + char1.getCurrent_hp() + " pv");
            char1.receive_skill(dmg);
            System.out.println(char1.getName() + " a " + char1.getCurrent_hp() + " pv");
        }

    }
}
