package utils;

public enum Devices {

    HUAWEI("L2N4C19923015627","Android");

    ;
    public String udid;
    public String platformName;


    Devices(String udid, String platformName) {
        this.udid = udid;

        this.platformName = platformName;

    }
}
