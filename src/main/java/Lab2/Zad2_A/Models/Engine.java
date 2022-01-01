package Lab2.Zad2_A.Models;

public class Engine {
    public enum FuelType {
        DIESEL, PETROL, GAS, ELECTRIC
    }

    private FuelType fuelType;
    private int horsePower;

    public Engine(FuelType fuelType, int horsePower) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "[" + fuelType + ", " + horsePower + ']';
    }
}
