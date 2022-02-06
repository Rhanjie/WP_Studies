package Lab5.Zad5_B.Commands;

import Lab5.Zad5_B.Application;
import Lab5.Zad5_B.Editor;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();

        app.clipboard = editor.getSelection();
        editor.deleteSelection();

        return true;
    }
}