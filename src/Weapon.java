public class Weapon {
    private int id;
    private String name;
    private int speed;
    private int strength;
    private int agility;
    private int intelligence;
    private Skill skill1;
    private Skill skill2;

    public Weapon()
    {
        this.id = 0;
        this.name = "test_weapon";
        this.speed = 1;
        this.strength = 5;
        this.agility = 5;
        this.intelligence = 5;
        this.skill1 = new Attack();
        this.skill2 = new Attack();
    }
    public Weapon(int id, String name, int speed, int strength, int agility, int intelligence, Skill skill1, Skill skill2) {
        this.id = id;
        this.name = name;
        this.speed = speed;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public int getStrength() {
        return strength;
    }
    public int getAgility() {
        return agility;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public Skill getSkill1() {
        return skill1;
    }
    public Skill getSkill2() {
        return skill2;
    }


    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public void setSkill1(Skill skill1) {
        this.skill1 = skill1;
    }
    public void setSkill2(Skill skill2) {
        this.skill2 = skill2;
    }
}
