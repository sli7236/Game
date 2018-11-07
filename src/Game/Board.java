package Game;
import Rooms.Room;
import People.Person;

public class Board {
   Room[][] map;

   public Board(Room[][] map)
   {
       this.map = map;
   }

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
