package Lab1.Zad1_C;

import Lab1.Zad1_C.Models.*;

public class MazeGame {
    public MazeGame() {}

    public Maze CreateMaze(MazeFactory mazeFactory) {
        Maze maze = mazeFactory.makeMaze();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door door = mazeFactory.makeDoor(room1, room2);

        maze.addRoom(room1);
        maze.addRoom(room2);

        room1.setSide(Room.Direction.North, mazeFactory.makeWall());
        room1.setSide(Room.Direction.East, door);
        room1.setSide(Room.Direction.South, mazeFactory.makeWall());
        room1.setSide(Room.Direction.West, mazeFactory.makeWall());

        room2.setSide(Room.Direction.North, mazeFactory.makeWall());
        room2.setSide(Room.Direction.East, mazeFactory.makeWall());
        room2.setSide(Room.Direction.South, mazeFactory.makeWall());
        room2.setSide(Room.Direction.West, door);

        return maze;
    }
};