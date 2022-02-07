package Lab5.Zad5_C;

public class Application {
    enum WebsiteType {
        FACEBOOK//, LINKEDIN
    }

    private SocialNetwork network;
    private SocialSpammer spammer;

    public void config(WebsiteType websiteType) {
        switch (websiteType) {
            case FACEBOOK -> network = new Facebook();
            //case LINKEDIN -> network = new Linkedin(); Dla przykladu
        }

        spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());

        spammer.send(iterator, "Very important message to friends");
    }

    public void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());

        spammer.send(iterator, "Very important message to coworkers");
    }
}
