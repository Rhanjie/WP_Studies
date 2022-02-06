package Lab5.Zad5_B;

import java.util.HashMap;

public class Shortcuts {
    private final HashMap<String, LambdaExecutor> savedShortcuts;

    public Shortcuts() {
        savedShortcuts = new HashMap<String, LambdaExecutor>();
    }

    public void saveShortcut(String keymap, LambdaExecutor command) {
        savedShortcuts.put(keymap, command);
    }

    public void onKeyPress(String keymap) {
        if (savedShortcuts.containsKey(keymap)) {
            savedShortcuts.get(keymap).execute();
        }
    }
}
