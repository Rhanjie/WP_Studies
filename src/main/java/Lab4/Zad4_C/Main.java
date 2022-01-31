package Lab4.Zad4_C;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pylek - Marcin Dyla\n");

        Forest forest = new Forest();

        forest.plantTree(10, 20, "pylek1", new Color(20, 30, 100), new Texture("res/texture1.png"));
        forest.plantTree(123, 456, "pylek1", new Color(20, 30, 100), new Texture("res/texture1.png"));
        forest.plantTree(1000, 0, "pylek1", new Color(20, 30, 100), new Texture("res/texture1.png"));

        forest.plantTree(200, 400, "pylek2", new Color(255, 0, 255), new Texture("res/texture2.png"));
        forest.plantTree(0, 0, "pylek2", new Color(255, 0, 255), new Texture("res/texture2.png"));

        forest.draw();
    }
}
