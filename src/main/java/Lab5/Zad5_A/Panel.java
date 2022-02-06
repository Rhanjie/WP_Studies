package Lab5.Zad5_A;

public class Panel extends Container {
    public String modalHelpText;

    private int x;
    private int y;
    private int w;
    private int h;

    Panel(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null) {
            //Wyswietl modalne okno dialogowe z trescia pomocy.
            System.out.println("Wyswietlono modalne okno dialogowe z trescia pomocy:\n" + modalHelpText);
        }

        else super.showHelp();
    }
}
