package Lab1.Zad1_C;

import Lab1.Zad1_C.Models.*;

public class MazeFactory {
    public MazeFactory(){}

    Maze makeMaze() {
        return new Maze();
    }

    Wall makeWall() {
        return new Wall();
    }

    Room makeRoom(int n) {
        return new Room(n);
    }

    Door makeDoor(Room room1, Room room2) {
        return new Door(room1, room2);
    }
}
