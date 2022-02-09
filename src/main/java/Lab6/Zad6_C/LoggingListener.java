package Lab6.Zad6_C;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LoggingListener implements EventListener{
    private File log;
    private String message;

    LoggingListener(String filename, String message) {
        this.log = new File(filename);
        this.message = message;
    }

    @Override
    public void update(String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(log.getAbsolutePath()));

            writer.write(message.replace("%s", log.getName()));
            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
