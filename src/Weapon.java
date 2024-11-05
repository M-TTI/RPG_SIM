public class Weapon {
    private int id;
    private String name;
    private int speed;
    private Skill skill1;
    private Skill skill2;

    public Weapon() {
        this.id = 0;
        this.name = "test_weapon";
        this.speed = 1;

        this.skill1 = new Skill();
        this.skill2 = new Skill();
    }
    public Weapon(int id, String name, int speed, Skill skill1, Skill skill2) {
        this.id = id;
        this.name = name;
        this.speed = speed;
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
    public void setSkill1(Skill skill1) {
        this.skill1 = skill1;
    }
    public void setSkill2(Skill skill2) {
        this.skill2 = skill2;
    }
}
