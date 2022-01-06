package Lab3.Zad3_A;

class Main {
    public static void main(String[] args) {
        System.out.println("Adapter - Marcin Dyla\n");

        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);

        System.out.println("Fits hole with peg: " + (hole.fits(peg) ? "true" : "false"));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        //hole.fits(smallSquarePeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Fits hole with small square peg: " + (hole.fits(smallSquarePegAdapter) ? "true" : "false"));
        System.out.println("Fits hole with large square peg: " + (hole.fits(largeSquarePegAdapter) ? "true" : "false"));
    }
}
