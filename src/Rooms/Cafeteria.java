package Rooms;
import People.Person;

public class Cafeteria extends Hallway {

    public Cafeteria(int x, int y)
    {
        super(x, y);
    }

    /**
     * Method controls the results when a person enters this room.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        System.out.println("You enter the cafeteria.");
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
        occupant = x;
        occupant = null;
    }
}
