public class Attack extends Skill
{
    protected int base_damage;

    public Attack()
    {
        super();
        this.base_damage = 20;
    }
    public Attack(int base_damage)
    {
        super();
        this.base_damage = base_damage;
    }
    public Attack(int id, String name, int base_damage)
    {
        super(id, name);
        this.base_damage = base_damage;
    }

    public int getBase_damage() {
        return base_damage;
    }

    public void setBase_damage(int base_damage) {
        this.base_damage = base_damage;
    }
}
