package Lab5.Zad5_A;

public abstract class Component implements ComponentWithContextualHelp {
    public String tooltipText = null;

    protected Container container;

    @Override
    public void showHelp() {
        if (tooltipText != null) {
            System.out.println("Pokazuje podpowiedz:\n" + tooltipText);
        }

        else container.showHelp();
    }
}
