package Lab2.Zad2_B;

public class Rectangle extends Shape {
    public int width;
    public int height;

    Rectangle() {
        super();
    }

    Rectangle(Rectangle source) {
        super(source);

        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
