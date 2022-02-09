package Lab6.Zad6_B;

public class Main {
    public static void main(String[] args) {
        System.out.println("Pamiatka - Marcin Dyla\n");

        Editor editor = new Editor("Hi", 2, 10, 200);
        Command command = new Command(editor);

        System.out.println("Stan poczatkowy");
        System.out.println(editor.toString());

        editor.setText("Hello");

        command.makeBackup();

        System.out.println("Stan na moment utworzenia kopii zapasowej");
        System.out.println(editor.toString());

        editor.setCursor(20, 22);

        editor.setSelectionWidth(400);
        editor.setText("Hello world!");

        System.out.println("Stan po modyfikacjach");
        System.out.println(editor.toString());

        command.undo();

        System.out.println("Stan po zastosowaniu opcji 'undo'");
        System.out.println(editor.toString());
    }
}
