package Lab5.Zad5_C;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterator - Marcin Dyla\n");

        Application application = new Application();
        application.config(Application.WebsiteType.FACEBOOK);

        Profile profile1 = new Profile("#0001", "admin@facebook.com");
        Profile profile2 = new Profile("#0002", "lord_wolf_123@gmail.com");

        application.sendSpamToFriends(profile1);

        System.out.println();

        application.sendSpamToCoworkers(profile1);

        System.out.println();

        application.sendSpamToFriends(profile2);
    }
}
