package client;

import interfaces.USBPort;

public class Laptop {
    public void connectToInternet(USBPort usbPort) {
        usbPort.connectWithUSB();
    }
}

