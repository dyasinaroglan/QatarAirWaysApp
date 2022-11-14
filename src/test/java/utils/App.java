package utils;

public enum App {

    QATARAIRWAYS("com.m.qr","com.m.qr.home.main.ui.HomeActivity");

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }
}
