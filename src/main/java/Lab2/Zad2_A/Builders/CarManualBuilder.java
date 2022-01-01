package Lab2.Zad2_A.Builders;

import Lab2.Zad2_A.Models.Engine;
import Lab2.Zad2_A.Models.Manual;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public Manual getProduct() {
        Manual finishedProduct = new Manual(manual);

        this.reset();

        return finishedProduct;
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.seatsManual = "Samochod posiada " + seats + " siedzenia";
    }

    @Override
    public void setEngine(Engine.FuelType fuelType, int horsePower) {
        String translatedFuel = "";

        switch (fuelType) {
            case GAS -> translatedFuel = "gaz";
            case DIESEL -> translatedFuel = "diesel";
            case PETROL -> translatedFuel = "benzyna";
            case ELECTRIC -> translatedFuel = "energia elektryczna";
        }

        manual.engineManual = "Silnik napedzany jest paliwem typu " + translatedFuel + " oraz posiada " + horsePower + " koni mechanicznych.";

        if (horsePower >= 300) {
            manual.engineManual += " Prosze uwazac, poniewaz samochod z takim silnikiem ma bardzo duze przyspieszenie!";
        }
    }

    @Override
    public void setTripComputer(boolean hasTouchscreen) {
        manual.tripComputerManual = "Ekran podkladowy zawiera wszystkie potrzebne kierowcy informacje...";

        if (hasTouchscreen) {
            manual.tripComputerManual += " Dla wygody kierowcy monitor wyposazony jest w ekran dotykowy";
        }
    }

    @Override
    public void setGps(boolean hasGps) {
        manual.gpsManual = (hasGps)
                ? "Samochod posiada GPS."
                : "Samochod nie posiada GPS i funkcjonalnosci z tym zwiazanej.";
    }
}
