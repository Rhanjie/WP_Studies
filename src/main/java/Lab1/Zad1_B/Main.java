package Lab1.Zad1_B;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory - Marcin Dyla\n");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeFactory.ShapeType.CIRCLE);
        Shape triangle = shapeFactory.getShape(ShapeFactory.ShapeType.TRIANGLE);
        Shape square = shapeFactory.getShape(ShapeFactory.ShapeType.SQUARE);
        Shape rectangle = shapeFactory.getShape(ShapeFactory.ShapeType.RECTANGLE);

        circle.draw();
        triangle.draw();
        square.draw();
        rectangle.draw();
    }
}
