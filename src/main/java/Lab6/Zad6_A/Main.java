package Lab6.Zad6_A;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mediator - Marcin Dyla\n");

        AuthenticationDialog authenticationDialog = new AuthenticationDialog();

        authenticationDialog.simulateUserActions();
    }
}
