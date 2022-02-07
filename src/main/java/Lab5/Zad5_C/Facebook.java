package Lab5.Zad5_C;

import java.util.ArrayList;

public class Facebook implements SocialNetwork {
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    @Override
    public ArrayList<Profile> socialGraphRequest(String profileId, String type) {
        ArrayList<Profile> profiles = new ArrayList<>();

        //Testowa implementacja metody, ktora zwraca jakies profile
        if (profileId.equals("#0001")) {
            if (type.equalsIgnoreCase("friends")) {
                profiles.add(new Profile("#0003", "test@test.pl"));
                profiles.add(new Profile("#0021", "abc@def.com"));
                profiles.add(new Profile("#1234", "qwerty@gmail.com"));
                profiles.add(new Profile("#0035", "admin@fotoski.pl"));
            }

            if (type.equalsIgnoreCase("coworkers")) {
                profiles.add(new Profile("#0021", "abc@def.com"));
                profiles.add(new Profile("#1234", "qwerty@gmail.com"));
                profiles.add(new Profile("#0420", "anonymous123@protonmail.com"));
            }
        }

        if (profileId.equals("#0002")) {
            if (type.equalsIgnoreCase("friends")) {
                profiles.add(new Profile("#0003", "test@test.pl"));
                profiles.add(new Profile("#3210", "rewewq2134@gmail.com"));

            }

            if (type.equalsIgnoreCase("coworkers")) {
                profiles.add(new Profile("#3210", "rewewq2134@gmail.com"));
            }
        }

        return profiles;
    }
}
