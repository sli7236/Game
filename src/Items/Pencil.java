package Items;
import People.Person;

public class Pencil implements Item{
    public void action(Person p)
    {
        p.health(0);
        p.GPA(1);
    }
    public String getName()
    {
        return "pencil";
    }
}
