package Lab2.Zad2_A.Models;

public class Manual {
    public String seatsManual;
    public String engineManual;
    public String tripComputerManual;
    public String gpsManual;

    public Manual() {}

    public Manual(Manual copiedManual) {
        this.seatsManual = copiedManual.seatsManual;
        this.engineManual = copiedManual.engineManual;
        this.tripComputerManual = copiedManual.tripComputerManual;
        this.gpsManual = copiedManual.gpsManual;
    }

    @Override
    public String toString() {
        return "Manual {\n" +
                "   seatsManual='" + seatsManual + "',\n" +
                "   engineManual='" + engineManual + "',\n" +
                "   tripComputerManual='" + tripComputerManual + "',\n" +
                "   gpsManual='" + gpsManual + "'\n" +
                '}';
    }
}
