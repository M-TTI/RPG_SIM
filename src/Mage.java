public class Mage extends Character {
    protected Weapon weapon;

    public Mage()
    {
        super();
        this.weapon = new Weapon();
    }

    public Mage(int id, String name, float hp, int defense, int strength, int agility,
                int intelligence, float critChance, Weapon weapon) {
        super(id, name, hp, defense, strength, agility, intelligence, critChance);
        this.weapon = weapon;
    }

    @Override
    public void attack(Attack attack, Character target) {
    }
}