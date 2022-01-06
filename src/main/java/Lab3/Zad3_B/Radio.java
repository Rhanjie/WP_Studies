package Lab3.Zad3_B;

public class Radio implements Device {
    private int channel = 0;
    private int volume = 50;
    private boolean enabled = false;

    Radio(int channel, int volume, boolean enabled) {
        this.channel = channel;
        this.volume = volume;
        this.enabled = enabled;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void enable() {
        enabled = true;
    }

    @Override
    public void disable() {
        enabled = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", enabled=" + enabled +
                '}';
    }
}
