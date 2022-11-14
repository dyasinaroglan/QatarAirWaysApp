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

    @Step("Sayfayi kaydir")
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
    @Step("<locator> elementini bul ve tıkla")
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    @Step("<locator> elementini bul ve <text> yaz")
    public void sendKeysTo(By locator, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
}
