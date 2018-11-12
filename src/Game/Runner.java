package Game;
import People.Person;
import Rooms.*;

import java.util.Scanner;

public class Runner {

    private static boolean gameOn = true;

    public static void main(String[] args) {
        Hallway[][] hallway = new Hallway[10][10];

        Board building = new Board(hallway);
        for (int x = 0; x< hallway.length; x++) {
            for (int y = 0; y < hallway[x].length; y++) {
                hallway[x][y] = new Hallway(x, y);
            }
        }

        Person player1 = new Person("FirstName", "FamilyName", 0,0,100,95,3);

        //Create cafeteria
        hallway[5][5] = new Cafeteria(5, 5);

        //Create library
        hallway[6][7] = new Library(6, 7);

        //Create APCSA room
        hallway[3][1] = new APCSA(3, 1);

        //Create random room with chips
        int x = (int)(Math.random()*hallway.length);
        int y = (int)(Math.random()*hallway.length);
        hallway[x][y] = new Chips(x, y);

        //Create random room with an apple
        x = (int)(Math.random()*hallway.length);
        y = (int)(Math.random()*hallway.length);
        hallway[x][y] = new Apple(x, y);

        //Create random room with cookies
        x = (int)(Math.random()*hallway.length);
        y = (int)(Math.random()*hallway.length);
        hallway[x][y] = new Cookies(x, y);

        Scanner in = new Scanner(System.in);
        hallway[0][0].enterRoom(player1);
        building.printBoard(player1);

        while(gameOn && player1.getHealth() > 0 )
        {
            System.out.println("Where would you like to move? (Choose N, S, E, W)");
            String move = in.nextLine();
            if(validMove(move, player1, hallway))
            {
                building.printBoard(player1);
                player1.setHealth(-5);
                System.out.print("Health: " + player1.getHealth() + ", ");
                System.out.print("GPA: " + player1.getGPA() + ", ");
                System.out.print("Wealth: $" + player1.getWealth() + " ");
                System.out.println();
                if (player1.getHealth() <=0)
                {
                    System.out.println("You ran out of health!");
                    gameOff();
                }

                //System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());

            }
            else {
                System.out.println("Please choose a valid move.");
            }


        }
        in.close();
    }



    public static boolean validMove(String move, Person p, Hallway[][] map)
    {
        move = move.toLowerCase().trim();
        switch (move) {
            case "n":
                if (p.getxLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            case "e":
                if (p.getyLoc()< map[p.getyLoc()].length -1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "s":
                if (p.getxLoc() < map.length - 1)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }

            case "w":
                if (p.getyLoc() > 0)
                {
                    map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
                    map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
                    return true;
                }
                else
                {
                    return false;
                }
            default:
                break;

        }
        return true;
    }
    public static void gameOff()
    {
        gameOn = false;
    }
}
