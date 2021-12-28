package Lab1.Zad1_A;

public final class Singleton1 {
    private static Singleton1 instance;

    private Singleton1(){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }

        return instance;
    }

    public void PrintValue() {
        System.out.println("Singleton1");
    }
}