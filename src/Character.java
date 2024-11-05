public class Character
{
    private int id;
    private String name;
    private double hp;
    private int defense;
    private double crit_chance;
    private double current_hp;
    private Weapon weapon;

    public Character() {
        this.id = 0;
        this.name = "test";
        this.hp = 500;
        this.defense = 10;
        this.crit_chance = 15;
        this.current_hp = this.hp;
        this.weapon = new Weapon();
    }
    public Character(int id, String name, double hp, int defense, double crit_chance, Weapon weapon) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.crit_chance = crit_chance;
        this.current_hp = this.hp;
        this.weapon = weapon;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getHp() {
        return hp;
    }
    public void setHp(float hp) {
        this.hp = hp;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public double getCrit_chance() {
        return crit_chance;
    }
    public void setCrit_chance(float crit_chance) {
        this.crit_chance = crit_chance;
    }
    public double getCurrent_hp() {
        return current_hp;
    }
    public void setCurrent_hp(float current_hp) {
        this.current_hp = current_hp;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public double cast_skill(Skill casted_skill)
    {
        double dmg = casted_skill.getBase_damage();

        boolean crited = false;
        int crit = (int) (Math.random() * 100) + 1;
        if(crit <= this.crit_chance)
        {
            dmg *= 2;
            crited = true;
        }

        System.out.println(this.getName()+" va infliger "+ dmg+" pt de dégat");
        if(crited){System.out.println("Coup critique !");}

        return dmg;
    }

    public double receive_skill(double dmg)
    {
        dmg -= this.getDefense();
        this.current_hp -= dmg;

        System.out.println(this.getName()+" a désormais "+this.current_hp+" pv");
        return this.current_hp;
    }

}
