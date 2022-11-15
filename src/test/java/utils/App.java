package utils;

public enum App {

    QATARAIRWAYS("com.pozitron.pegasus","com.monitise.mea.pegasus.ui.splash.SplashActivity");

    public String appPackage;
    public String appActivity;

    App(String appPackage, String appActivity) {
        this.appPackage = appPackage;
        this.appActivity = appActivity;
    }
}
