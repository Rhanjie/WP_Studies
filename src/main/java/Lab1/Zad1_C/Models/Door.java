package Lab1.Zad1_C.Models;

public class Door extends Wall{
    Room room1;
    Room room2;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
    }
}
