package Lab5.Zad5_B.Commands;

import Lab5.Zad5_B.Application;
import Lab5.Zad5_B.Editor;

public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    Command(Application app, Editor editor) {
        this.app = app;
        this.editor = editor;

        backup = "";
    }

    public void saveBackup() {
        backup = editor.text;
    }

    public void undo() {
        editor.text = backup;
    }

    public abstract boolean execute();
}
