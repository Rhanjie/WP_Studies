package Lab5.Zad5_B.Commands;

import Lab5.Zad5_B.Application;
import Lab5.Zad5_B.Editor;

public class UndoCommand extends Command {
    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        app.undo();

        return false;
    }
}