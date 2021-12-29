package Lab1.Zad1_C.Models;

import java.util.HashMap;

public class Room {
    public enum Direction {North, West, East, South}

    private int n;

    private final HashMap<Direction, Wall> sides;

    public Room(int n) {
        this.n = n;

        sides = new HashMap<>();
        sides.put(Direction.North, null);
        sides.put(Direction.West, null);
        sides.put(Direction.East, null);
        sides.put(Direction.South, null);
    }

    public void setSide(Direction direction, Wall wall) {
        sides.put(direction, wall);
    }
}
