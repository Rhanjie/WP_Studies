package Lab3.Zad3_A;

public class SquarePeg implements ISquare {
    private double width;

    SquarePeg(double width) {
        this.width = width;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
