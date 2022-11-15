package steps;

import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import methods.Methods;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;

import java.util.List;
import java.util.Locale;


public class SelectDateStep extends Driver {

    Methods methods = new Methods();
    Logger logger = Logger.getLogger(Driver.class.getName());


    @Step("<xpath> seçiniz butonuna tıklanır")
    public void clickButton(String element) {
        methods.waitS(1);
        driver.findElement(By.xpath(element)).click();
    }

    @Step("<xpath> tarih seçilir")
    public void dateSelect(String element) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element)))).click();
    }

    @Step("<id> ucuz uçuş ara butonu tıklanır")
    public void ucuzUcusButton(String element) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element)))).click();
    }

    @Step("<xpath> uçuşlar listelenir")
    public void ucusList(String element) {
        List<MobileElement> ucusList = driver.findElements(By.xpath(element));
        ucusList.get(methods.randomSayi(ucusList.size())).click();
    }

    @Step("<xpath> ekonomi sınıfı seçilir")
    public void ekoClassSelect(String element) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(element)))).click();
    }

    @Step("<xpath> uçuş saatleri kontrol edilir")
    public void ucusSaatControl(String element) {
        List<MobileElement> ucusSaatList = driver.findElements(By.xpath(element));
        int options = ucusSaatList.size();
        int option = methods.randomSayi(options);
        ucusSaatList.get(option).findElements(By.xpath(element)).get(option).getText();

        Assert.assertEquals(ucusSaatList.get(option).findElements(By.xpath(element)).get(option).getText(), ucusSaatList.get(option).findElements(By.xpath(element)).get(option).getText());

    }

    }





