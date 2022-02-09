package Lab6.Zad6_C;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obserwator - Marcin Dyla\n");

        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener("/res/test123.txt", "Someone has opened the file: %s");
        editor.events.subscribe("open", logger);

        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");
        editor.events.subscribe("save", emailAlerts);

        //editor.events.notify("open", "Nieautoryzowane uzycie");
        editor.events.notify("save", "ABC DEF GHJ");
    }
}
