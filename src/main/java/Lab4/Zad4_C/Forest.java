package Lab4.Zad4_C;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> trees;

    Canvas canvas;

    Forest() {
        canvas = new Canvas();
        trees = new ArrayList<>();
    }

    public void plantTree(int x, int y, String name, Color color, Texture texture) {
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}
