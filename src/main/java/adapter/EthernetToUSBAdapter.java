package adapter;

import devices.EthernetPort;
import interfaces.USBPort;

public class EthernetToUSBAdapter implements USBPort {
    private EthernetPort ethernetPort;

    public EthernetToUSBAdapter(EthernetPort ethernetPort) {
        this.ethernetPort = ethernetPort;
    }

    public void connectWithUSB() {
        System.out.println("Adapting Ethernet to USB...");
        ethernetPort.connectWithEthernet();
    }
}

