package Lab6.Zad6_B;

public class Snapshot {
    private Editor editor;

    private String text;
    private int curX;
    private int curY;
    private int selectionWidth;

    Snapshot(Editor editor, String text, int curX, int curY, int selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void restore() {
        editor.setText(text);
        editor.setCursor(curX, curY);
        editor.setSelectionWidth(selectionWidth);
    }
}
