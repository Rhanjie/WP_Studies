package Lab3.Zad3_A;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    SquarePegAdapter(SquarePeg squarePeg) {
        super(squarePeg.getWidth() * Math.sqrt(2) / 2f);

        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2f;
    }
}
