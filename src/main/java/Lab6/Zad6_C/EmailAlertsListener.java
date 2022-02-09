package Lab6.Zad6_C;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailAlertsListener implements EventListener{
    private String email;
    private String message;

    EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String data) {
        //system.email(email, replace('%s',filename,message))

        System.out.println(message.replace("%s", data));
    }
}
