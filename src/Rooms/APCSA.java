package Rooms;

import People.Person;

public class APCSA extends Hallway {
    Person occupant;
    int xLoc,yLoc;

    public APCSA(int x, int y)
    {
        super(x, y);
        xLoc = x;
        yLoc = y;
    }

    public int getxLoc() { return xLoc; }
    public int getyLoc() {
        return yLoc;
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
        System.out.println("You enter the AP Computer Science A room.");
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
