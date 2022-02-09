package Lab6.Zad6_C;

import java.util.ArrayList;
import java.util.HashMap;

public class EventManager {
    private HashMap<String, ArrayList<EventListener>> listeners;

    EventManager() {
        listeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        if (!listeners.containsKey(eventType)) {
            listeners.put(eventType, new ArrayList<>());
        }

        listeners.get(eventType).add(listener);
    }

    public void unsubscribe(String eventType, String listener) {
        listeners.get(eventType).remove(listener);
    }

    public void notify(String eventType, String data) {
        if (!listeners.containsKey(eventType)) {
            listeners.put(eventType, new ArrayList<>());
        }

        for (var listener : listeners.get(eventType)) {
            listener.update(data);
        }
    }
}
