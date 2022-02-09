package Lab6.Zad6_B;

public class Command {
    private Editor editor;
    private Snapshot backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup() {
        backup = editor.createSnapshot();
    }

    public void undo() {
        if (backup != null) {
            backup.restore();
        }
    }
}
