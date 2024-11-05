public abstract class Character
{
    protected int id;
    protected String name;
    protected float hp;
    protected int defense;
    protected int strengh;
    protected int agility;
    protected int intelligence;
    protected float crit_chance;
    protected float current_hp;
    protected int current_defense;

    public Character()
    {
        this.id = 0;
        this.name = "test";
        this.hp = 500;
        this.defense = 10;
        this.strengh = 10;
        this.agility = 10;
        this.intelligence = 10;
        this.crit_chance = 15;
        this.current_hp = this.hp;
        this.current_defense = this.defense;
    }

    public Character(int id,
                     String name,
                     float hp,
                     int defense,
                     int strengh,
                     int agility,
                     int intelligence,
                     float crit_chance)
    {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.strengh = strengh;
        this.agility = agility;
        this.intelligence = intelligence;
        this.crit_chance = crit_chance;
        this.current_hp = this.hp;
        this.current_defense = this.defense;
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
    public float getHp() {
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
    public int getStrengh() {
        return strengh;
    }
    public void setStrengh(int strengh) {
        this.strengh = strengh;
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public float getCrit_chance() {
        return crit_chance;
    }
    public void setCrit_chance(float crit_chance) {
        this.crit_chance = crit_chance;
    }
    public float getCurrent_hp() {
        return current_hp;
    }
    public void setCurrent_hp(float current_hp) {
        this.current_hp = current_hp;
    }
    public int getCurrent_defense() {
        return current_defense;
    }
    public void setCurrent_defense(int current_defense) {
        this.current_defense = current_defense;
    }

    public abstract void attack(Attack attack, Character target);
}
