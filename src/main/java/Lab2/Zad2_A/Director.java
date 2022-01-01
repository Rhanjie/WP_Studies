package Lab2.Zad2_A;

import Lab2.Zad2_A.Builders.Builder;
import Lab2.Zad2_A.Models.Engine;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void constructSportCar() {
        this.builder.setSeats(2);
        this.builder.setEngine(Engine.FuelType.PETROL, 400);
        this.builder.setTripComputer(true);
        this.builder.setGps(true);
    }

    public void constructSUV() {
        this.builder.setSeats(5);
        this.builder.setEngine(Engine.FuelType.DIESEL, 250);
        this.builder.setTripComputer(false);
        this.builder.setGps(true);
    }
}
