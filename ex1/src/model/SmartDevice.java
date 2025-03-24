package model;

public abstract class SmartDevice {
    String deviceName;
    boolean isOn;

    public SmartDevice(String deviceName, boolean isOn) {
        this.deviceName = deviceName;
        this.isOn = isOn;
    }

    abstract void performFunction();
    void turnOn(){
        isOn = true;
        System.out.println("Device is on");
    }
    void turnOff(){
        isOn = false;
        System.out.println("Device is off");
    }
}

