package Lab4.Zad4_A;

public class FileDataSource implements DataSource {
    private String filename;

    FileDataSource(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Zapisuje dane do pliku");
    }

    @Override
    public String readData() {
        System.out.println("Odczytuje dane z pliku");

        return "dupa";
    }
}
