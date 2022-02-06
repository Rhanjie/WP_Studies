package Lab5.Zad5_B.Commands;

import Lab5.Zad5_B.Application;
import Lab5.Zad5_B.Editor;

public class CopyCommand extends Command {
    public CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();

        return false;
    }
}
