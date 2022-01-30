package Lab4.Zad4_A;

public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Zaszyfruj dane (przykladowy kod)
        StringBuilder compressedData = new StringBuilder();
        for (char letter : data.toCharArray()) {
            compressedData.append((char)(letter + 2));
        }

        super.writeData(compressedData.toString());
    }

    @Override
    public String readData() {
        String data = super.readData();

        //Zdekompresuj dane (przykladowy kod)
        StringBuilder decompressedData = new StringBuilder();
        for (char letter : data.toCharArray()) {
            decompressedData.append((char)(letter - 2));
        }

        return decompressedData.toString();
    }
}
