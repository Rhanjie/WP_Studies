package Lab5.Zad5_C;

public class Profile {
    private String id;
    private String email;

    Profile(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
