package Lab4.Zad4_A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dekorator - Marcin Dyla\n");

        String salaryRecords = "Tajne liczby i informacje o zarobkach";

        System.out.println("Dane:");
        System.out.println(salaryRecords);

        DataSource source = new FileDataSource("res/file.data");
        source.writeData(salaryRecords);

        salaryRecords = source.readData();

        source = new CompressionDecorator(source);
        source.writeData(salaryRecords);

        salaryRecords = source.readData();

        System.out.println("Skompresowane dane:");
        System.out.println(source.debugReadData());

        System.out.println("Zdekompresowane dane:");
        System.out.println(salaryRecords);

        source.writeData(salaryRecords);

        source = new EncryptionDecorator(source);
        source.writeData(salaryRecords);

        System.out.println("Zaszyfrowane i skompresowane dane:");
        System.out.println(source.debugReadData());

        System.out.println("Odszyfrowane i zdekompresowane dane:");
        System.out.println(salaryRecords);
    }
}
