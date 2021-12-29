package Lab1.Zad1_B;

public class ShapeFactory {
    public enum ShapeType {
        CIRCLE, TRIANGLE, SQUARE, RECTANGLE,
    }

    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            case SQUARE -> {
                return new Square();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
        }

        return null;
    }
}
