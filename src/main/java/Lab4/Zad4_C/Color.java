package Lab4.Zad4_C;

public class Color {
    private int r;
    private int g;
    private int b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "{" + r + ", " + g + ", " + b + '}';
    }
}
