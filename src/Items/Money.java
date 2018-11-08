package Items;

import People.Person;

public class Money {
    int x = (int)(Math.random() * 20);
    public void action(Person p)
    {
        p.setHealth(5);
        p.setGPA(0);
        p.setWealth(x);
    }
    public String getName()
    {
        return "$"+x;
    }
}
