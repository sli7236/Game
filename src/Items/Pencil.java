package Items;
import People.Person;

public class Pencil implements Item{
    public void action(Person p)
    {
        p.setHealth(0);
        p.setGPA(1);
        p.setWealth(0);
    }
    public String getDesc()
    {
        return "pencil";
    }
}
