package Rooms;

import People.Person;
import Items.Item;

public class APCSA extends Hallway implements Item {

    public APCSA(int x, int y)
    {
        super(x, y);
    }

    public void action(Person p)
    {
        p.setHealth(-20);
        p.setGPA(3);
        p.setWealth(0);
    }

    public String getDesc()
    {
        return "You enter the AP Computer Science Room. You ace your test and increase your GPA, but your health decreases because taking the test made you tired.";
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
