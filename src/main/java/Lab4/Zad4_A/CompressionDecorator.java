package Lab4.Zad4_A;

public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Skompresuj dane (przykladowy kod)
        String compressedData = "[ZAKOMPRESOWANE]" + data;

        super.writeData(compressedData);
    }

    @Override
    public String readData() {
        String data = super.readData();

        //Zdekompresuj dane (przykladowy kod)
        String decompressedData = data.replace("[ZAKOMPRESOWANE]", "");

        return decompressedData;
    }
}
