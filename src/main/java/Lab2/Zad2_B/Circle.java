package Lab2.Zad2_B;

public class Circle extends Shape {
    public int radius;

    Circle() {
        super();
    }

    Circle(Circle source) {
        super(source);

        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
