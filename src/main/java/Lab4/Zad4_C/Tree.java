package Lab4.Zad4_C;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas) {
        type.draw(canvas, this.x, this.y);
    }
}
