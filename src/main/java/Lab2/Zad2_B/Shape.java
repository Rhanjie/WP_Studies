package Lab2.Zad2_B;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    Shape() {

    }

    Shape(Shape source) {
        this();

        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape clone();
}
