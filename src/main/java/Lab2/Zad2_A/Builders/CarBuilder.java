package Lab2.Zad2_A.Builders;

import Lab2.Zad2_A.Models.Car;
import Lab2.Zad2_A.Models.Engine;
import Lab2.Zad2_A.Models.TripComputer;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public Car getProduct() {
        Car finishedProduct = new Car(car);

        this.reset();

        return finishedProduct;
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.seats = seats;
    }

    @Override
    public void setEngine(Engine.FuelType fuelType, int horsePower) {
        this.car.engine = new Engine(fuelType, horsePower);
    }

    @Override
    public void setTripComputer(boolean hasTouchscreen) {
        this.car.tripComputer = new TripComputer(hasTouchscreen);
    }

    @Override
    public void setGps(boolean hasGps) {
        this.car.hasGps = hasGps;
    }
}
