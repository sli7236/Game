package Items;

import People.Person;

public class Money {
    int x = (int)(Math.random() * 20);
    public void action(Person p)
    {
        p.health(5);
        p.GPA(0);
        p.wealth(x);
    }
    public String getName()
    {
        return "apple";
    }
}
