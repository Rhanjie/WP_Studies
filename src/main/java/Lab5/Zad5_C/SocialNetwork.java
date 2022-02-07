package Lab5.Zad5_C;

import java.util.ArrayList;

public interface SocialNetwork {
    public ProfileIterator createFriendsIterator(String profileId);
    public ProfileIterator createCoworkersIterator(String profileId);

    ArrayList<Profile> socialGraphRequest(String profileId, String type);
}
