package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.navigation.ChoucairAcademyPage;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        // En esta clase es donde se realizan todas las interacciones necesarias
        actor.attemptsTo(Click.on(ChoucairAcademyPage.LOGGIN_BUTTON),
                Enter.theValue("username").into(ChoucairAcademyPage.INPUT_USERNAME),
                Enter.theValue("password").into(ChoucairAcademyPage.INPUT_PASSWORD),
                Click.on(ChoucairAcademyPage.ENTER_BUTTON)
        );

    }
}
