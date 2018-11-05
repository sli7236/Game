package Game;
import Rooms.Room;

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

   public void printBoard()
   {
       for(Room[] i : map)
       {
           for (Room j : i)
           {
               System.out.print("[]");
           }
           System.out.println();
       }
   }

}
