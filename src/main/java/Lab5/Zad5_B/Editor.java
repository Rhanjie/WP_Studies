package Lab5.Zad5_B;

public class Editor {
    public String text;

    int startIndexSelection = 0;
    int endIndexSelection = 0;

    Editor(String text) {
        this.text = text;
    }

    public void setSelection(int startIndexSelection, int endIndexSelection) {
        this.startIndexSelection = startIndexSelection;
        this.endIndexSelection = endIndexSelection;

        this.check();
    }

    public String getSelection() {
        return text.substring(startIndexSelection, endIndexSelection + 1);
    }

    public void deleteSelection() {
        StringBuilder stringBuilder = new StringBuilder(text);

        stringBuilder.delete(startIndexSelection, endIndexSelection + 1);

        text = stringBuilder.toString();
    }

    public void replaceSelection(String selection) {
        text = text.substring(startIndexSelection, endIndexSelection) + selection + text.substring(endIndexSelection);
        text = text;
    }

    private void check() {
        if (startIndexSelection < 0)
            startIndexSelection = 0;

        if (startIndexSelection > text.length() - 1)
            startIndexSelection = text.length() - 1;

        if (endIndexSelection < 0)
            endIndexSelection = 0;

        if (endIndexSelection > text.length() - 1)
            endIndexSelection = text.length() - 1;

        if (startIndexSelection > endIndexSelection) {
            int temp = startIndexSelection;

            startIndexSelection = endIndexSelection;
            endIndexSelection = temp;
        }
    }
}
