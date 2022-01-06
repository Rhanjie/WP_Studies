package Lab3.Zad3_A;

public class RoundHole implements IRound {
    private double radius;

    RoundHole(double radius) {
        this.radius = radius;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius()  >= peg.getRadius();
    }
}
