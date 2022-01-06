package Lab3.Zad3_B;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge - Marcin Dyla\n");

        Tv tv = new Tv(1, 50, false);
        RemoteControl remoteControl = new RemoteControl(tv);

        System.out.println(tv.toString());

        remoteControl.togglePower();

        remoteControl.channelUp();
        remoteControl.channelUp();

        remoteControl.volumeUp();

        System.out.println(tv.toString());

        Radio radio = new Radio(5, 100, true);
        RemoteControl advancedRemoteControl = new AdvancedRemoteControl(radio);

        System.out.println(radio.toString());

        advancedRemoteControl.channelUp();
        advancedRemoteControl.channelDown();
        advancedRemoteControl.channelDown();

        advancedRemoteControl.volumeDown();
        advancedRemoteControl.volumeDown();
        advancedRemoteControl.volumeDown();

        advancedRemoteControl.togglePower();

        System.out.println(radio.toString());
    }
}
