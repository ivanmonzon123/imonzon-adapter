import adapter.EthernetToUSBAdapter;
import client.Laptop;
import devices.EthernetPort;
import devices.WiFiDongle;
import interfaces.USBPort;

class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();

        USBPort wifiDongle = new WiFiDongle();

        EthernetPort ethernetPort = new EthernetPort();
        USBPort ethernetToUSB = new EthernetToUSBAdapter(ethernetPort);

        System.out.println("=== Connecting using Ethernet Adapter ===");
        laptop.connectToInternet(ethernetToUSB);

        System.out.println("\n=== Connecting using WiFi Dongle ===");
        laptop.connectToInternet(wifiDongle);
    }
}
