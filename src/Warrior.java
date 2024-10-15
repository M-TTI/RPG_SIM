public class Warrior extends Character
{
    protected Weapon weapon;

    public Warrior()
    {
        super();
        this.weapon = new Weapon();
    }

    public Warrior(int id,
                   String name,
                   float hp,
                   int defense,
                   int strengh,
                   int agility,
                   int intelligence,
                   float crit_chance,
                   Weapon weapon)
    {
        super(id,
                name,
                hp,
                defense,
                strengh,
                agility,
                intelligence,
                crit_chance);
        this.weapon = weapon;
    }

    @Override
    public void attack(Attack attack, Character target) {
        //TODO implement attack()
    }
}
