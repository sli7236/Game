package Items;
import People.Person;

public class Chips implements Item{
    public void action(Person p)
    {
        p.setHealth(15);
        p.setGPA(0);
        p.setWealth(-1);
    }
    public String getName()
    {
        return "chips";
    }
}
