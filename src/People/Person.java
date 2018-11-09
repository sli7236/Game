package People;

/**
 * Person represents the player as they move through the game.
 */
public class Person {
    String firstName;
    String familyName;
    int xLoc, yLoc;
    int health;
    int GPA;
    double wealth;

    public int getxLoc() { return xLoc; }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public Person (String firstName, String familyName, int xLoc, int yLoc, int health, int GPA, int wealth)
    {
        this.firstName = firstName;
        this.familyName = familyName;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.health = health;
        this.GPA = GPA;
        this.wealth = wealth;
    }


    public int setHealth(int i) {
        health += i;
        return health;
    }

    public int getHealth() {
        return health;
    }

    public int setGPA(int i)
    {
        GPA += i;
        return GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public double setWealth(double i)
    {
        wealth += i;
        return wealth;
    }

    public double getWealth() {
        return wealth;
    }
}
