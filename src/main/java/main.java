// Here the ways to connect
class EthernetPort {
    public void connectWithEthernet() {
        System.out.println("Connected to the internet using an Ethernet cable.");
    }
}

class WiFiDongle implements USBPort {
    public void connectWithUSB() {
        System.out.println("Connected to the internet using a WiFi Dongle via USB.");
    }
}


// Here the adapter
class EthernetToUSBAdapter implements USBPort {
    private EthernetPort ethernetPort;

    public EthernetToUSBAdapter(EthernetPort ethernetPort) {
        this.ethernetPort = ethernetPort;
    }

    public void connectWithUSB() {
        System.out.println("Adapting Ethernet to USB...");
        ethernetPort.connectWithEthernet();
    }
}

// Laptop class
class Laptop {
    public void connectToInternet(USBPort usbPort) {
        usbPort.connectWithUSB();
    }
}

interface USBPort {
    void connectWithUSB();
}

// Laptop as client
class AdapterPatternExample {
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
