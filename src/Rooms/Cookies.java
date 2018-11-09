package Rooms;
import Items.Item;
import People.Person;

public class Cookies extends Hallway implements Item {
    Person occupant;
    int xLoc,yLoc;

    public Cookies(int x, int y)
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

    public void action(Person p)
    {
        p.setHealth(5);
        p.setGPA(0);
        p.setWealth(0);
    }
    public String getDesc()
    {
        return "cookies";
    }
}
