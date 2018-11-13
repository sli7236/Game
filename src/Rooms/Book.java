package Rooms;
import Items.Item;
import People.Person;

public class Book extends Hallway implements Item {
    public Book(int x, int y)
    {
        super(x, y);
    }

    public void action(Person p)
    {
        p.setHealth(-10);
        p.setGPA(2);
        p.setWealth(0);
    }
    public String getDesc()
    {
        return "You find a book and read it. Your GPA increases, but your health decreases because reading made you tired.";
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
