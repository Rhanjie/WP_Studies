package Lab4.Zad4_C;

public class TreeType {
    public String name;
    public Color color;
    public Texture texture;

    TreeType(String name, Color color, Texture texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas, int x, int y) {
        // 1. Utwórz mapę bitową o danym typie, kolorze i teksturze.
        // 2. Narysuj mapę bitową na ekranie w punkcie o współrzędnych X i Y.

        canvas.render("Rysuje " + name  + " o kolorze " + color.toString() + " i wspolrzednych {" + x + ", " + y + "}");
    }
}
