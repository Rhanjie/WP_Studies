package Lab4.Zad4_A;

public class EncryptionDecorator extends DataSourceDecorator {
    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        //Zaszyfruj dane

        super.writeData(data);
    }

    @Override
    public String readData() {
        String data = super.readData();

        //Odszyfruj dane

        return data;
    }
}
