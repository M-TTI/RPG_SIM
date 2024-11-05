public class Skill
{
    private int id;
    private String name;
    private double base_damage;

    public Skill() {
        this.id = 0;
        this.name = "test_skill";
        this.base_damage = 20.0;
    }
    public Skill(int id, String name, double base_damage) {
        this.id = id;
        this.name = name;
        this.base_damage = base_damage;
    }

    public double getBase_damage()
    {
        return base_damage;
    }
    public void setBase_damage(double base_damage)
    {
        this.base_damage = base_damage;
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

}
