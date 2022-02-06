package Lab5.Zad5_B.Commands;

import Lab5.Zad5_B.Application;
import Lab5.Zad5_B.Editor;

public class PasteCommand extends Command {
    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        saveBackup();

        editor.replaceSelection(app.clipboard);

        return true;
    }
}