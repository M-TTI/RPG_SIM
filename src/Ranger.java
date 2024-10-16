public class Ranger extends Character {
    protected String weapon ;

    public Ranger() {
        super();
        this.weapon = "undefined";
    }

    public Ranger(String name,float hp, int defense, int strengh, int agility, int intelligence, float crit_chance,float current_hp, int current_defense, String w) {
        super(name,hp,defense,strengh, agility, intelligence, crit_chance,current_hp,current_defense);
        this.weapon = w ;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return STR."Ranger{weapon='\{weapon}\{'\''}\{'}'}";
    }
}
