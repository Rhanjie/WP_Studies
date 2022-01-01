package Lab2.Zad2_A;

import Lab1.Zad1_A.Singleton1;
import Lab1.Zad1_A.Singleton2;
import Lab2.Zad2_A.Builders.CarBuilder;
import Lab2.Zad2_A.Builders.CarManualBuilder;
import Lab2.Zad2_A.Models.Car;
import Lab2.Zad2_A.Models.Manual;

class Main {
    public static void main(String[] args) {
        System.out.println("Builder - Marcin Dyla\n");

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.setBuilder(carBuilder);
        director.constructSportCar();
        Car car = carBuilder.getProduct();

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.setBuilder(carManualBuilder);
        director.constructSportCar();

        Manual manual = carManualBuilder.getProduct();

        System.out.println(car.toString());
        System.out.println(manual.toString());
    }
}