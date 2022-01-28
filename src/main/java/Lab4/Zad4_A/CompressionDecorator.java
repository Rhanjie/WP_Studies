package Lab4.Zad4_A;

public class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Skompresuj dane

        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();

        //Zdekompresuj dane

        return data;
    }
}
