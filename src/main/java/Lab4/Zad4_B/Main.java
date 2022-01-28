package Lab4.Zad4_B;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fasada - Marcin Dyla\n");

        VideoConverter converter = new VideoConverter();

        File mp4 = null;
        try {
            mp4 = converter.convert("res/funny-cats-video.ogg", "mp4");
        } catch (IOException exception) {
            System.out.println("Blad podczas konwersji pliku!");
            exception.printStackTrace();

            return;
        }

        try {
            if (mp4.createNewFile()) {
                System.out.println("Konwersja pliku przeprowadzona pomyslnie!");

                return;
            }

            System.out.println("Nie udalo sie zapisac skonwertowanego pliku, poniewaz juz taki istnieje!");
        }

        catch (IOException exception) {
            System.out.println("Nie udalo sie stworzyc pliku!");

            exception.printStackTrace();
        }
    }
}
