package Items;
import People.Person;

public class Homework implements Item{
    public void action(Person p)
    {
        p.health(2);
        p.GPA(1);
    }
    public String getName()
    {
        return "homework";
    }
}
