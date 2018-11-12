package Rooms;
import Items.Item;
import People.Person;

public class Apple extends Hallway implements Item {

    public Apple(int x, int y)
    {
        super(x, y);
    }

    public void action(Person p)
    {
        p.setHealth(20);
        p.setGPA(0);
        p.setWealth(0);
    }
    public String getDesc() {
        return "You find an apple in the room and eat it.";
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
