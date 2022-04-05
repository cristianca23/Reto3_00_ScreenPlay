package starter.navigation;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")
public class ChoucairAcademyPage extends PageObject {

    //Se definiran los objetos de la pagina

    public static final By LOGGIN_BUTTON = By.xpath("//*[@id='nav-menu']/ul[2]/li/a"); //Boton para hacer login
    public static final By INPUT_USERNAME = By.id("username"); //Campo username
    public static final By INPUT_PASSWORD = By.id("password"); //Campo password
    public static final By ENTER_BUTTON =    By.xpath("//*[@id='Ingresar']/div/div/div[2]/div[2]/form/div[3]/button"); //Boton acceder


    // Buscaremos el curso
    public static final By UNIVERSIDAD_CHOUCAIR =    By.className("card_index"); //Imagen de universidad Choucair
    public static final By COURSE_SEARCH_TEXTBOX =    By.id("coursesearchbox"); // Text Box para buscar
    public static final By COURSE_SEARCH =    By.xpath("//*[@id='coursesearch']/fieldset/button"); //Boton Ir para buscar el curso
    public static final By SELECT_COURSE =    By.className("result-title"); //Seleccionar el curso deseado


    //Nombre del curso

    public static final By NAME_COURSE = By.className("result-title");






}
