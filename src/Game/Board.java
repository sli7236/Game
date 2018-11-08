package Game;
import Rooms.Room;
import Rooms.Hallway;
import Rooms.Cafeteria;
import Rooms.Library;
import Rooms.APCSA;
import People.Person;

public class Board {
   Room[][] map;
   Hallway[][] hallway;
   Cafeteria[][] cafeteria;
   Library[][] library;
   APCSA[][] apcsa;


   public Board(Room[][] map) { this.map = map; }

   public Board(int height, int width)
   {
       this.map = map;
   }

   public void addRoom(Room room, int row, int col)
   {
       map[row][col] = room;
   }

   public void printBoard(Person player)
   {
       for(Room[] i : map)
       {
           for (Room j : i)
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
