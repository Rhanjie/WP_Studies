package Lab2.Zad2_B;

import Lab2.Zad2_A.Builders.CarBuilder;
import Lab2.Zad2_A.Builders.CarManualBuilder;
import Lab2.Zad2_A.Director;
import Lab2.Zad2_A.Models.Car;
import Lab2.Zad2_A.Models.Manual;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Shape> shapes;

    public static void main(String[] args) {
        System.out.println("Prototype - Marcin Dyla\n");

        shapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 10;
        circle.radius = 20;

        shapes.add(circle);

        Circle anotherCircle = (Circle)circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        shapes.add(rectangle);

        businessLogic();
    }

    private static void businessLogic()  {
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        for (var shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        System.out.println(shapesCopy.toString());
    }
}
