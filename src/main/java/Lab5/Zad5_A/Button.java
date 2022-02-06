package Lab5.Zad5_A;

public class Button extends Component {
    private int x;
    private int y;
    private int w;
    private int h;
    private String text;

    Button(int x, int y, int w, int h, String text) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.text = text;
    }
}
