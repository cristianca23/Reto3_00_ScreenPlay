package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.questions.Answer;
import starter.tasks.Login;
import starter.tasks.OpenUp;
import starter.tasks.Search;

public class ChoucairAcademyStepsDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("than brandon wants to learn automation at the academy Choucair")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {

        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }

    @When("^he search for the course (.*) on the choucair academy$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademy(String course) {

        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));


    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(String question) {

        //Should se utiliza para escribir las questions

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));



    }
}
