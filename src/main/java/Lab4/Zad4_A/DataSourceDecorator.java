package Lab4.Zad4_A;

public class DataSourceDecorator implements DataSource {
    protected DataSource wrapper;

    DataSourceDecorator(DataSource source) {
        wrapper = source;
    }

    @Override
    public void writeData(String data) {
        wrapper.writeData(data);
    }

    @Override
    public String readData() {
        return wrapper.readData();
    }

    @Override
    public String debugReadData() {
        return wrapper.debugReadData();
    }
}
