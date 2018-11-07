package Items;
import People.Person;

public class Apple implements Item{
    public void action(Person p)
    {
        p.health(5);
        p.GPA(0);
    }
    public String getName()
    {
        return "apple";
    }
}
