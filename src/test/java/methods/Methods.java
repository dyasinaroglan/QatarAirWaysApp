package methods;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;

import java.time.Duration;
import java.util.logging.Logger;

public class Methods extends Driver {

    private static Logger log = Logger.getLogger(Methods.class.getName());


    public void scrollTo(){
        Dimension dimension = Driver.driver.manage().window().getSize();
        int height = dimension.getHeight();
        int width = dimension.getWidth();

        int startX = (int) (width * 0.6);
        int finishX = (int) (width * 0.3);
        int startY = height / 2;
        int finishY = height / 2;

        TouchAction touch = new TouchAction(Driver.driver);
        touch.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(finishX, finishY)).release().perform();
    }

    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
        log.info(locator + "Elementine tıklandı tıklandı");
    }

    public void sendKeysTo(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
        log.info(locator + "Elementine text girildi");
    }
    public void waitS(long seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info(seconds + " saniye beklendi");
    }
    public void scrollTo(double x, double y, double x1, double y1) throws InterruptedException {
        Dimension dimension = Driver.driver.manage().window().getSize();
        int startX = (int) (dimension.width * x);
        int finishX = (int) (dimension.width * x1);

        int startY = (int) (dimension.height * y);
        int finishY = (int) (dimension.height * y1);
        //boyutları belirledikten sonra dokunma eylemine geçiyoruz
        TouchAction touch = new TouchAction(Driver.driver);

        for (int i = 0; i < 5; i++) {
            touch.press(PointOption.point(startX, startY)) //başlanılan yer
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(finishX, finishY)).release().perform(); // biten yer
        }
        log.info("Scroll yapıldı");
    }
    public int randomSayi(int size){
        return (int) (Math.random() * size);

    }
}
