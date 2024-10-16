public class Mage extends Character {
    protected Weapon weapon;

    public Mage() {
        this(0, "Mage", 100, 5, 10, 15, 30, 0.15f, new Weapon()); // Appel au constructeur avec paramètres et valeurs par défaut
    }

    public Mage(int id, String name, float hp, int defense, int strength, int agility,
                int intelligence, float critChance, Weapon weapon) {
        super(id, name, hp, defense, strength, agility, intelligence, critChance);
        this.weapon = weapon;
    }

    @Override
    public void attack(Attack attack, Character target) {
        // Implémentation de l'attaque du Mage...
    }
}