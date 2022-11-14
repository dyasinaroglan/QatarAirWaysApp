package utils;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.apache.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.LogManager;

public class Driver {

    protected static AppiumDriver<MobileElement> driver;
    static AppiumDriverLocalService service;
    public static WebDriverWait wait;
    private static Logger logger = Logger.getLogger(Driver.class.getName());

    public static void runAppium() {
        service = new AppiumServiceBuilder()
                .withIPAddress("127.0.0.1")
                .usingAnyFreePort().build();
        service.clearOutPutStreams();
        service.start();

    }

    public static void stopAppium() {
        service.stop();
    }

    public static DesiredCapabilities capabilities(Devices device, App app) {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", device.udid);
        capabilities.setCapability("appium:platformName", device.platformName); //mobil işlemcinin adı
        capabilities.setCapability("noReset", device.fullReset); // tam bir sıfırlama gerçekleştirme. her defasında login olma durumu
        //noResetoturumdan önce uygulama durumunu sıfırlamayın diyorum. tekrar kullanıcı adı ve şifre girme

        capabilities.setCapability("appium:appPackage", app.appPackage);  //aplikasyonun package adresi
        capabilities.setCapability("appium:appActivity", app.appActivity); //başlatmak istediğimiz Android etkinliğinin adı

        return capabilities;
    }

    @BeforeScenario
    public void startAppium() {
        logger.info("Appium started");
        capabilities(Devices.HUAWEI, App.QATARAIRWAYS);
        runAppium();
        driver = new AppiumDriver<>(service.getUrl(), capabilities(Devices.HUAWEI, App.QATARAIRWAYS));
        wait = new WebDriverWait(driver, 30);
    }

    @AfterScenario
    public void stopApp() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
        stopAppium();
        logger.info("Appium is stopped");
    }

}
