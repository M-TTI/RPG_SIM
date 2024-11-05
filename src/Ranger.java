public class Ranger extends Character {

    protected Weapon weapon;

    public Ranger() {
        super();
        this.weapon = new Weapon();
    }

    public Ranger(int id,
                  String name,
                  float hp,
                  int defense,
                  int strengh,
                  int agility,
                  int intelligence,
                  float crit_chance,
                  float current_hp,
                  int current_defense,
                  Weapon weapon) {
        super(id,
                name,
                hp,
                defense,
                strengh,
                agility,
                intelligence,
                crit_chance
        );
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void attack(Attack attack, Character target) {
        //TODO implement attack()
    }
}
