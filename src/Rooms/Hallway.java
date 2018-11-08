package Rooms;

import People.Person;

public class Hallway {
    Person occupant;
    int xLoc,yLoc;

    public Hallway(int x, int y)
    {
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
    public void enterRoom(Person x)
    {
        System.out.println("You are in the hallway.");
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
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
