package Lab3.Zad3_C;

import java.util.ArrayList;

public class Main {
    private static CompoundGraphic all;

    public static void main(String[] args) {
        System.out.println("Composite - Marcin Dyla\n");

        load();
        draw();

        System.out.println("\n----------------------\n");

        var group = new ArrayList<>(all.childrens.subList(0, 2));

        groupSelected(group);

        draw();


        System.out.println("\n----------------------\n");

        group = new ArrayList<>(all.childrens.subList(0, 1));
        removeSelected(group);

        move(10, 20);

        draw();
    }

    public static void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        all.add(new Circle(3, 6, 100));
        all.add(new Dot(100, 50));
    }

    public static void groupSelected(ArrayList<Graphic> components) {
        CompoundGraphic group = new CompoundGraphic();

        for (var component: components) {
            group.add(component);
            all.remove(component);
        }

        all.add(group);
    }

    public static void removeSelected(ArrayList<Graphic> components) {
        for (var component: components) {
            all.remove(component);
        }
    }

    public static void move(int offsetX, int offsetY) {
        all.move(offsetX, offsetY);
    }

    public static void draw() {
        all.draw();
    }
}
