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
    int wealth;


    public int health() { return health;}
    public int GPA(){ return GPA; }
    public int wealth(){ return wealth; }


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


    public int health(int i) {
        health += i;
        return health;
    }

    public int GPA(int i)
    {
        GPA += i;
        return GPA;
    }

    public int wealth(int i)
    {
        wealth += i;
        return wealth;
    }
}
