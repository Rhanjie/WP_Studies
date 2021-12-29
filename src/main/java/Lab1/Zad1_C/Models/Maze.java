package Lab1.Zad1_C.Models;

import java.util.ArrayList;

public class Maze {
    private ArrayList<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void print() {
        System.out.println("Rysuje zwykly labirynt");
    }
}
