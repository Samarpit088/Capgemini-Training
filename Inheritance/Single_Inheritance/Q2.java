package Inheritance.Single_Inheritance;
// Smart Home Devices
public class Q2 {
    public static void main(String[] args) {
        Thermostat t1 = new Thermostat("TH1", true, 24);
        t1.displayStatus();
    }
}
class Device {
    String deviceId;
    boolean status;

    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println("Temp: " + temperatureSetting + " | Status: " + status);
    }
}

