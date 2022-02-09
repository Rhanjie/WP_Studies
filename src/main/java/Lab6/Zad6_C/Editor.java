package Lab6.Zad6_C;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Editor {
    public EventManager events;
    private File file;

    Editor()  {
        events = new EventManager();
    }

    public void openFile(String path) {
        this.file = new File(path);
        events.notify("open", file.getName());
    }

    public void saveFile() throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
        writer.write(str);
        writer.close();

        events.notify("save", file.getName());
    }
}
