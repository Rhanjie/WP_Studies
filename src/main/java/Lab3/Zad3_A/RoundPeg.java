package Lab3.Zad3_A;

public class RoundPeg implements IRound {
    protected double radius;

    RoundPeg(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }
}
