package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;



public class RegistrarPacientesPage extends PageObject {

    public static By AGREGAR_PACIENTE = By.xpath("//*[@class='list-group-item'][2]");
    public static By TEXTBOX_NOMBRE   = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(1) > input");
    public static By TEXTBOX_APELLIDO = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(2) > input");
    public static By TEXTBOX_TELEFONO = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(3) > input");
    public static By TEXBOX_CC        = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(5) > input");
    public static By CHECKBOX_PREPAGADA = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div.checkbox > label");
    public static By BUTTON_GUARDAR   = By.xpath("//*[@class='btn btn-primary pull-right']");


}
