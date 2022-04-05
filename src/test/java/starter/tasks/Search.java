package starter.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.navigation.ChoucairAcademyPage;

public class Search implements Task {

    private String course;

    public Search(String course) {
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairAcademyPage.UNIVERSIDAD_CHOUCAIR),
                Enter.theValue(course).into(ChoucairAcademyPage.COURSE_SEARCH_TEXTBOX),
                Click.on(ChoucairAcademyPage.COURSE_SEARCH),
                Click.on(ChoucairAcademyPage.SELECT_COURSE)
                );

    }
}
