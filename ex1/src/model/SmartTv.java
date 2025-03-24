package model;

public class SmartTv extends SmartDevice implements Connectable{
    public SmartTv(String deviceName, boolean isOn) {
        super(deviceName, isOn);
    }

    @Override
    public void connectToWifi(String wifiAddress) {
        System.out.println("Kết nối TV tới mạng: " + wifiAddress);
    }

    @Override
    void performFunction() {
        System.out.println("Trình chiếu nội dung 4K");
    }
}
