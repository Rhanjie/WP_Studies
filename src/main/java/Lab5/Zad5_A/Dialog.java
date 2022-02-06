package Lab5.Zad5_A;

public class Dialog extends Container {
    public String wikiPageURL = null;

    Dialog(){}
    Dialog(String wikiPageURL) {
        this.wikiPageURL = wikiPageURL;
    }

    @Override
    public void showHelp() {
        if (wikiPageURL != null) {
            //Otworz strone z pomoca na wiki
            System.out.println("Otwarto strone z pomoca na wiki o adresie: " + wikiPageURL);
        }

        else super.showHelp();
    }
}
