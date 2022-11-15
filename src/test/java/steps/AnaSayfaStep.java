package steps;

import com.thoughtworks.gauge.Step;
import methods.Methods;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AnaSayfaPage;
import utils.Driver;
import static locators.AnaSayfaLocators.*;

public class AnaSayfaStep extends Driver {

    Methods methods = new Methods();
    Logger logger = Logger.getLogger(Driver.class.getName());


    @Step("Ana sayfa açılır ve kontrol edilir")
    public void implementation1() {
        methods.waitS(2);

        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(lHosgeldinText)).getText();

        Assert.assertEquals("Hoş Geldin!", text);
        methods.waitS(2);
        logger.info("Ana sayfa açıldı ve Hoş Geldin! yazısı görüntülendi");

    }

    @Step("üye olmadan devam et butonuna tıklanır")
    public void implementation2() {
        methods.clickTo(lExitButton);

    }
}
