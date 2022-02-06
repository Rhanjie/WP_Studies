package Lab5.Zad5_B;

import Lab5.Zad5_B.Commands.*;

import java.util.ArrayList;

public class Application {
    public String clipboard;
    ArrayList<Editor> editors;
    Editor activeEditor;
    CommandHistory history;

    private Shortcuts shortcuts;
    private Button copyButton;
    private Button cutButton;
    private Button pasteButton;
    private Button undoButton;

    public void createUI() {
        //Przykladowy kod ustawiania edytorow
        editors = new ArrayList<>();
        editors.add(new Editor("test1 test2 test3"));
        editors.add(new Editor("Hello world!"));
        editors.add(new Editor("abcdef ghi jkl"));

        activeEditor = editors.get(1);

        history = new CommandHistory();
        shortcuts = new Shortcuts();

        //------------------------

        LambdaExecutor copy = () -> {
            executeCommand(new CopyCommand(this, activeEditor));
        };

        copyButton = new Button();
        copyButton.setCommand(copy);
        shortcuts.saveShortcut("Ctrl+C", copy);


        LambdaExecutor cut = () -> {
            executeCommand(new CutCommand(this, activeEditor));
        };

        cutButton = new Button();
        cutButton.setCommand(cut);
        shortcuts.saveShortcut("Ctrl+X", cut);


        LambdaExecutor paste = () -> {
            executeCommand(new PasteCommand(this, activeEditor));
        };

        pasteButton = new Button();
        pasteButton.setCommand(paste);
        shortcuts.saveShortcut("Ctrl+V", paste);


        LambdaExecutor undo = () -> {
            executeCommand(new UndoCommand(this, activeEditor));
        };

        undoButton = new Button();
        undoButton.setCommand(undo);
        shortcuts.saveShortcut("Ctrl+Z", undo);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    public void undo() {
        Command command = history.pop();

        if (command != null) {
            command.undo();
        }
    }

    public void simulateSomeUserActions() {
        activeEditor.setSelection(2, 4);

        System.out.println(activeEditor.text);

        copyButton.onClick();

        activeEditor.setSelection(0, 0);

        shortcuts.onKeyPress("Ctrl+V"); //paste

        System.out.println(activeEditor.text);

        activeEditor.setSelection(6, 8);

        shortcuts.onKeyPress("Ctrl+X"); //cut

        System.out.println(activeEditor.text);

        undoButton.onClick();

        System.out.println(activeEditor.text);

        shortcuts.onKeyPress("Ctrl+Z"); //undo

        System.out.println(activeEditor.text);
    }
}
