package Items;
import People.Person;

public class Apple implements Item{
    public void action(Person p)
    {
        p.setHealth(30);
        p.setGPA(0);
        p.setWealth(0);
    }
    public String getName()
    {
        return "apple";
    }
}