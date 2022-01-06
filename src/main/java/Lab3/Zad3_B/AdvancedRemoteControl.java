package Lab3.Zad3_B;

public class AdvancedRemoteControl extends RemoteControl {

    AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
    }
}
