package Rooms;

import People.Person;
import Items.Item;

public class Money extends Hallway implements Item{

    public Money(int x, int y)
    {
        super(x, y);
    }

    int x = (int)(Math.random() * 20);
    public void action(Person p)
    {
        p.setHealth(5);
        p.setGPA(0);
        p.setWealth(x);
    }
    public String getDesc()
    {
        return "You find $"+x + " on the ground.";
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println(getDesc());
    }



    /**
     * Removes the player from the room.
     * @param x
     */
    public void leaveRoom(Person x)
    {
        occupant = null;
    }


}
