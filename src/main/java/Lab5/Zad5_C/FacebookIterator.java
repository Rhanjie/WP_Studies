package Lab5.Zad5_C;

import java.util.ArrayList;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String profileId;
    private String type;

    private int currentPosition;
    private ArrayList<Profile> cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
            cache = cache;
        }
    }

    @Override
    public Profile getNext() {
        if (hasMore()) {
            return cache.get(currentPosition++);
        }

        return null;
    }

    @Override
    public boolean hasMore() {
        lazyInit();

        return currentPosition < cache.size();
    }
}
