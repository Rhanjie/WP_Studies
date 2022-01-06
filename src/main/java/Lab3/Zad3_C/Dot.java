package Lab3.Zad3_C;

public class Dot implements Graphic {
    protected int x;
    protected int y;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Rysuje kropke o wspolrzednych [" + x + ", " + y + "]");
    }
}
