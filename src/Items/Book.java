package Items;
import People.Person;

public class Book implements Item{
    public void action(Person p)
    {
        p.setHealth(-20);
        p.setGPA(1);
        p.setWealth(0);
    }
    public String getDesc()
    {
        return "book";
    }
}
