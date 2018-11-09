package Rooms;

import People.Person;

public class Library extends Hallway {
    Person occupant;
    int xLoc,yLoc;

    public Library(int x, int y)
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
        System.out.println("You enter the library.");
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
