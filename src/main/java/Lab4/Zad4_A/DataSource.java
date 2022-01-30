package Lab4.Zad4_A;

public interface DataSource {
    public void writeData(String data);
    public String readData();

    public String debugReadData(); //Tylko do sprawdzenia, czy kompresja i szyfrowanie dziala
}
