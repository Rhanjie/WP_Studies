package Lab2.Zad2_A.Models;

public class Car {

    public int seats = 0;
    public Engine engine;
    public TripComputer tripComputer;
    public boolean hasGps;

    public Car() {}

    public Car(Car copiedCar) {
        this.seats = copiedCar.seats;
        this.engine = copiedCar.engine;
        this.tripComputer = copiedCar.tripComputer;
        this.hasGps = copiedCar.hasGps;
    }


    @Override
    public String toString() {
        return "Car {" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", hasGps=" + hasGps +
                '}';
    }
}
