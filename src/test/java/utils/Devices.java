package utils;

public enum Devices {

    HUAWEI("L2N4C19923015627","Android","android");

    ;
    public String udid;
    public String platformName;
    public String fullReset;

    Devices(String udid, String platformName, String fullReset) {
        this.udid = udid;

        this.platformName = platformName;
        this.fullReset = fullReset;
    }
}
