package Lab5.Zad5_C;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();

            //System.sendEmail(profile.getEmail(), message)
            System.out.println("Wyslano maila na adres: " + profile.getEmail() + " o tresci: '" + message + "'");
        }
    }
}
