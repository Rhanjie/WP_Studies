package Lab3.Zad3_C;

public class Circle extends Dot {
    float radius;

    Circle(int x, int y, int radius) {
        super(x, y);

        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Rysuje kropke o wspolrzednych [" + x + ", " + y + "] o promieniu " + radius);
    }
}
