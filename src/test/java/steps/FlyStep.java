package steps;

import com.thoughtworks.gauge.Step;
import methods.Methods;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;
import static locators.FlyLocators.*;

public class FlyStep extends Driver {

    Methods methods = new Methods();
    Logger logger = Logger.getLogger(Driver.class.getName());

    @Step("ucuz uçuş ara tıklanır")
    public void implementation1() throws InterruptedException {
        methods.clickTo(lUcuzUcusAraButton);

    }

    @Step("Nereden ve nereye butonları tıklanır ve şehirler seçilir")
    public void implementation2() throws InterruptedException {
        methods.clickTo(lNeredenButton);
        methods.waitS(2);
        methods.scrollTo(0.5, 0.9, 0.5, 0.15);
        methods.clickTo(lCityNereden);
        methods.waitS(1);
        methods.clickTo(lNereyeButton);
        methods.waitS(1);
        methods.scrollTo(0.5, 0.9, 0.5, 0.16);
        methods.clickTo(lCityNereye);

    }
    @Step("Şehir ve havaalanı check edilir")
    public void implementation5() {
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(lGidisHavaalani)).getText();
        Assert.assertEquals(textGidisHavaalani, text);
        logger.info("gidiş havaalanı kontrol edildi");

        String text2 = wait.until(ExpectedConditions.visibilityOfElementLocated(lDonusHavaalani)).getText();
        Assert.assertEquals(textDonusHavaalani, text2);
        logger.info("dönüş havaalanı kontrol edildi");

    }

    @Step("Tek yön seçilir")
    public void implementation3() {
        methods.clickTo(lTekYonButton);

    }


}
