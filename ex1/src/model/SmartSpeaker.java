package model;

public class SmartSpeaker extends SmartDevice implements Connectable{
    public SmartSpeaker(String deviceName, boolean isOn) {
        super(deviceName, isOn);
    }

    @Override
    public void connectToWifi(String wifiAddress) {

    }

    @Override
    void performFunction() {

    }
}
