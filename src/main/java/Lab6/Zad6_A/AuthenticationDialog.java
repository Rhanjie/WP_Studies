package Lab6.Zad6_A;

public class AuthenticationDialog implements Mediator {
    private String title;
    private Checkbox loginOrRegisterChkbx;
    private Textbox loginUsername;
    private Textbox loginPassword;

    private Textbox registrationUsername;
    private Textbox registrationPassword;
    private Textbox registrationEmail;

    private Button okBtn;
    private Button cancelBtn;

    AuthenticationDialog() {
        // Utwórz wszystkie obiekty-komponenty i przekaż bieżący
        // mediator ich konstruktorom by ustanowić połączenia.

        loginOrRegisterChkbx = new Checkbox(this);

        loginUsername = new Textbox(this);
        loginPassword = new Textbox(this);

        registrationUsername = new Textbox(this);
        registrationPassword = new Textbox(this);
        registrationEmail = new Textbox(this);

        okBtn = new Button(this);
        cancelBtn = new Button(this);
    }

    public void simulateUserActions() {
        loginOrRegisterChkbx.check();

        okBtn.click();
    }

    @Override
    public void notify(Component sender, String event) {
        if (sender == loginOrRegisterChkbx && event == "check") {
            if (loginOrRegisterChkbx.checked) {
                title = "Log in";

                // 1. Pokaż komponenty formularza logowania.
                // 2. Ukryj komponenty formularza rejestracji.
            }

            else {
                title = "Register";

                // 1. Pokaż komponenty formularza rejestracji.
                // 2. Ukryj komponenty formularza logowania.
            }

            System.out.println(title);
        }

        if (sender == okBtn && event == "click") {
            if (loginOrRegisterChkbx.checked) {
                // Spróbuj znaleźć użytkownika po
                // poświadczeniach.

                boolean found = false;
                if (!found) {
                    // Pokaż komunikat błędu nad polem nazwy
                    // użytkownika.

                    System.out.println("Blad! Nieprawidlowe dane");
                }
            }

            else {
                // 1. Utwórz konto użytkownika korzystając z
                // danych w polach formularza rejestracji.
                // 2. Zaloguj użytkownika.
                // ...

                System.out.println("Pomyslnie zarejestrowano/zalogowano!");
            }
        }
    }
}
