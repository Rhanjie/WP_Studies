package Lab5.Zad5_B.Commands;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class CommandHistory {
    private final ArrayList<Command> history;

    public CommandHistory() {
        history = new ArrayList<>();
    }

    public void push(Command command) {
        history.add(command);
    }

    public Command pop() {
        if (history.isEmpty())
            return null;

        return history.remove(history.size() - 1);
    }
}
