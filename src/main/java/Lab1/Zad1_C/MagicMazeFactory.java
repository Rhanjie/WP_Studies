package Lab1.Zad1_C;

import Lab1.Zad1_C.Models.*;
import Lab1.Zad1_C.Models.Magic.MagicDoor;
import Lab1.Zad1_C.Models.Magic.MagicMaze;
import Lab1.Zad1_C.Models.Magic.MagicRoom;
import Lab1.Zad1_C.Models.Magic.MagicWall;

public class MagicMazeFactory extends MazeFactory {
    public MagicMazeFactory(){}

    Maze makeMaze() {
        return new MagicMaze();
    }

    Wall makeWall() {
        return new MagicWall();
    }

    Room makeRoom(int n) {
        return new MagicRoom(n);
    }

    Door makeDoor(Room room1, Room room2) {
        return new MagicDoor(room1, room2);
    }
}
