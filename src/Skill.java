public abstract class Skill
{
    protected int id;
    protected String name;

    public Skill()
    {
        this.id = 0;
        this.name = "test_skill";
    }
    public Skill(int id, String name) {
        this.id = id;
        this.name = name;
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
