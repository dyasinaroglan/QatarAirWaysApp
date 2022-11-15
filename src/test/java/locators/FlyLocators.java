package locators;

import org.openqa.selenium.By;
import utils.Driver;

public interface FlyLocators  {

    By lUcuzUcusAraButton = By.id("com.pozitron.pegasus:id/layout_home_page_content_button_search_flight");
    By lNereyeButton = By.xpath("//android.widget.TextView[@package='com.pozitron.pegasus' and @text='Nereye?']");
    By lNeredenButton = By.xpath("//android.widget.TextView[@resource-id='com.pozitron.pegasus:id/v2_layout_input_field_textview_label' and @text='Nereden?']");

    By lNeredenYaz = By.xpath("//android.widget.FrameLayout[@resource-id='com.pozitron.pegasus:id/fragment_port_selection_edit_text_from_port' and @index='1']");
    By lNereyeYaz = By.xpath("//android.widget.FrameLayout[@resource-id='com.pozitron.pegasus:id/fragment_port_selection_edit_text_to_port' and @index='3']");
    By lCityNereden = By.xpath("//android.widget.TextView[@resource-id='com.pozitron.pegasus:id/list_item_port_selection_list_content_port_name' and @text='Istanbul - Sabiha Gokcen']");
    By lCityNereye = By.xpath("//android.widget.TextView[@resource-id='com.pozitron.pegasus:id/list_item_port_selection_list_content_port_name' and @text='Izmir']");
    By lTekYonButton = By.id("com.pozitron.pegasus:id/right");
    By lGidisHavaalani = By.xpath("//android.widget.EditText[@package='com.pozitron.pegasus' and @text='Istanbul - Sabiha Gokcen']");
    String textGidisHavaalani = "Istanbul - Sabiha Gokcen";
    String textDonusHavaalani = "Izmir";
    By lDonusHavaalani = By.xpath("//android.widget.EditText[@package='com.pozitron.pegasus' and @text='Izmir']");
}
