import devices.Device;
import devices.Radio;
import devices.TV;
import remotes.AdvancedRemote;
import remotes.BasicRemote;
import remotes.Remote;

public class Main {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        Remote basicRemote = new BasicRemote(device);
        basicRemote.power();
        basicRemote.channelDown();
        basicRemote.channelUp();
        basicRemote.channelUp();
        basicRemote.volumeUp();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.channelDown();
        advancedRemote.channelUp();
        advancedRemote.channelUp();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        device.printStatus();
    }
}
