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

    public void setHealth(int i) {
        this.health += i;
    }

    public int getHealth() {
        return this.health;
    }

    public void setGPA(int i)
    {
        this.GPA += i;
    }

    public int getGPA() {
        return this.GPA;
    }

    public void setWealth(double i)
    {
        this.wealth += i;
    }

    public double getWealth() {
        return this.wealth;
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
}
