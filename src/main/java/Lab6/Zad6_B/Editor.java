package Lab6.Zad6_B;

public class Editor {
    private String text;
    private int curX;
    private int curY;
    private int selectionWidth;

    Editor(){}
    Editor(String text, int curX, int curY, int selectionWidth) {
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setCursor(int x, int y) {
        curX = x;
        curY = y;
    }

    public void setSelectionWidth(int width) {
        selectionWidth = width;
    }

    public Snapshot createSnapshot()  {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", curX=" + curX +
                ", curY=" + curY +
                ", selectionWidth=" + selectionWidth +
                "}\n";
    }
}
