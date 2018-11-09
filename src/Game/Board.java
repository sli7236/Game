package Game;
import Rooms.Hallway;
import People.Person;

public class Board {
   Hallway[][] map;

   public Board(Hallway[][] map) { this.map = map; }

   public Board(int height, int width)
   {
       this.map = map;
   }

   public void addRoom(Hallway hallway, int row, int col)
   {
       map[row][col] = hallway;
   }

   public void printBoard(Person player)
   {
       for(Hallway[] i : map)
       {
           for (Hallway j : i)
           {
               if (player.getxLoc() == j.getxLoc() && player.getyLoc() == j.getyLoc())
               {
                   System.out.print("[P]");
               }
               else
               {

                   System.out.print("[-]");
               }
           }
           System.out.println();
       }
   }

}
