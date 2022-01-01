package Lab2.Zad2_A.Models;

public class TripComputer {
    private boolean hasTouchscreen;

    public TripComputer(boolean hasTouchscreen) {
        this.hasTouchscreen = hasTouchscreen;
    }

    @Override
    public String toString() {
        return "[" + hasTouchscreen + ']';
    }
}
