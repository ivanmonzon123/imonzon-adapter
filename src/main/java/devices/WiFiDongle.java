package devices;

import interfaces.USBPort;

public class WiFiDongle implements USBPort {
    public void connectWithUSB() {
        System.out.println("Connected to the internet using a WiFi Dongle via USB.");
    }
}


