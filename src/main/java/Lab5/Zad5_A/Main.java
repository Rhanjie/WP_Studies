package Lab5.Zad5_A;

import java.util.Random;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        System.out.println("Lancuch zobowiazan - Marcin Dyla\n");

        dialog = new Dialog("Budget Reports");
        dialog.wikiPageURL = "https://pl.wikipedia.org/";

        Panel panel = new Panel(0, 0, 400, 800);
        panel.modalHelpText = "This panel does...";

        Button ok = new Button(250, 760, 50, 20, "OK");
        ok.tooltipText = "This is an OK button that...";

        Button cancel = new Button(320, 760, 50, 20, "Cancel");

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);

        //Udawane klikniecia uzytkownika w losowych miejscach na ekranie
        for (int i = 0; i < 5; i++) {
            onF1KeyPress();
        }
    }

    public static void onF1KeyPress() {
        Component component = getComponentAtMouseCoords();

        System.out.println("[DEBUG]: Wybrany komponent" + component.toString());
        component.showHelp();
        System.out.println();
    }

    public static Component getComponentAtMouseCoords() {
        //Testowy kod
        Random random = new Random();

        Container container;
        int value = random.nextInt(100);
        if (value <= 33) {
            return dialog;
        }

        else if (value <= 66) {
            container = (Container)dialog.children.get(0);

            return container;
        }

        else {
            container = (Container)dialog.children.get(0);

            int randomIndex = random.nextInt(container.children.size());

            return container.children.get(randomIndex);
        }
    }
}
