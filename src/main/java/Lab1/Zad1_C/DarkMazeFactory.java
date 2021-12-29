package Lab1.Zad1_C;

import Lab1.Zad1_C.Models.*;
import Lab1.Zad1_C.Models.Dark.DarkDoor;
import Lab1.Zad1_C.Models.Dark.DarkMaze;
import Lab1.Zad1_C.Models.Dark.DarkRoom;
import Lab1.Zad1_C.Models.Dark.DarkWall;

public class DarkMazeFactory extends MazeFactory {
    public DarkMazeFactory(){}

    Maze makeMaze() {
        return new DarkMaze();
    }

    Wall makeWall() {
        return new DarkWall();
    }

    Room makeRoom(int n) {
        return new DarkRoom(n);
    }

    Door makeDoor(Room room1, Room room2) {
        return new DarkDoor(room1, room2);
    }
}
