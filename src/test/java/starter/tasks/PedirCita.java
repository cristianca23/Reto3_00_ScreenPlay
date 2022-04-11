package starter.tasks;

import com.github.javafaker.Faker;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.WebDriver;
import starter.navigation.PedirCitaPage;


import java.util.concurrent.TimeUnit;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class PedirCita implements Task {

    PedirCitaPage pedirCitaPage;


    protected Faker faker = new Faker();
    protected static WebDriver driver;

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(pedirCitaPage),
                Click.on(PedirCitaPage.AGENDAR_CITA_LIST),
                Enter.theValue("04/12/2022").into(PedirCitaPage.DIA_CITA),
                Click.on(PedirCitaPage.CALENDARIO)
                );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+faker.number().numberBetween(1000000,9999999))).into(PedirCitaPage.CC_PACIENTE),
                Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+faker.number().numberBetween(1000000,9999999))).into(PedirCitaPage.CC_DOCTOR),
                Enter.theValue(faker.internet().slug()).into(PedirCitaPage.COMENTARIOS),
                Click.on(PedirCitaPage.BUTTON_GUARDAR));


    }


    public static Performable PedirCita(){

        return instrumented(PedirCita.class);

    }
}
