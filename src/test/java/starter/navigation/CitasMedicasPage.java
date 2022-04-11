package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


public class CitasMedicasPage extends PageObject {

    public static By AGREGAR_DOCTOR =   By.className("list-group-item");
    public static By TEXTBOX_NOMBRE =   By.id("name");
    public static By TEXBOX_APELLIDO =  By.id("last_name");
    public static By TEXTBOX_TELEFONO = By.id("telephone");
    public static By TEXTBOX_CC       = By.id("identification");
    public static By BUTTON_GUARDAR   = By.xpath("//*[@id=\"page-wrapper\"]/div/div[3]/div/a");
    public static By DATA_SAVE        = By.cssSelector("#page-wrapper > div > div.panel.panel-success > div.panel-body");
}
