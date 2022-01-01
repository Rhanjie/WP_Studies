package Lab2.Zad2_A.Builders;

import Lab2.Zad2_A.Models.Engine;

public interface Builder {
    public abstract void reset();
    public abstract void setSeats(int seats);
    public abstract void setEngine(Engine.FuelType fuelType, int horsePower);
    public abstract void setTripComputer(boolean hasTouchscreen);
    public abstract void setGps(boolean hasGps);
}
