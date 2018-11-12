package Rooms;
import Items.Item;
import People.Person;

public class Chips extends Hallway implements Item{

    public Chips(int x, int y)
    {
        super(x, y);
    }

    public void action(Person p)
    {
        p.setHealth(15);
        p.setGPA(0);
        p.setWealth(0);
    }
    public String getDesc()
    {
        return "You find chips in a room and eat them.";
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
