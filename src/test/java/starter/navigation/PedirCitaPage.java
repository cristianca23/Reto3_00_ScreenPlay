package starter.navigation;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PedirCitaPage extends PageObject {


    public static By AGENDAR_CITA_LIST   = By.xpath("//*[@class='list-group-item'][6]");
    public static By DIA_CITA       = By.id("datepicker");
    public static By CALENDARIO     = By.className("page-header");
    public static By CC_PACIENTE    = By.xpath("//*[@class='form-control'][1]");
    public static By CC_DOCTOR      = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(3) > input");
    public static By COMENTARIOS    = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > div:nth-child(4) > textarea");
    public static By BUTTON_GUARDAR = By.cssSelector("#page-wrapper > div > div:nth-child(3) > div > a");


}
