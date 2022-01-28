package Lab4.Zad4_A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dekorator - Marcin Dyla\n");

        String salaryRecords = "Tajne liczby i informacje o zarobkach";

        DataSource source = new FileDataSource("file.data");
        source.writeData(salaryRecords);

        source = new EncryptionDecorator(source);
        source.writeData(salaryRecords);
    }
}
