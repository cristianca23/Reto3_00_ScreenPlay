package starter.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.DefaultUrl;
import starter.navigation.CitasMedicasPage;
import starter.navigation.RegistrarPacientesPage;
import starter.questions.AnswerCitasMedicas;
import starter.tasks.OpenCitasMedicas;
import starter.tasks.PedirCita;
import starter.tasks.RegistrarPaciente;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;


public class CitaMedicaStepDefinitions {

    RegistrarPacientesPage registrarPacientesPage;
    CitasMedicasPage citasMedicasPage;
    String name;

    @Before()
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que (.*) necesita registrar un nuevo doctor$")
    public void que_Carlos_necesita_registrar_un_nuevo_doctor(String name) {

        this.name = name;
        theActor(name).attemptsTo(Open.browserOn(citasMedicasPage));


    }

    @When("el realiza el registro del mismo en el aplicativo de Administracion de Hospitales")
    public void elRealizaElRegistroDelMismoEnElAplicativoDeAdministracionDeHospitales() {
        OnStage.theActorCalled(name).wasAbleTo(OpenCitasMedicas.WithData("Cristian", "Lopez", "376281", "123424567"));
    }

    @Then("^el verifica que se presente en pantalla el mensaje (.*)$")
    public void el_verifica_que_se_presente_en_pantalla_el_mensaje_Datos_guardados_correctamente(String verificar) {

        theActorInTheSpotlight().should(
                seeThat("El objeto fue guardado", AnswerCitasMedicas.validarGuardado(), equalTo(verificar))
        );

        System.out.println(AnswerCitasMedicas.validarGuardado().answeredBy(theActorInTheSpotlight()));
    }

    //Escenario 2

    @Given("^que (.*) necesita registrar un nuevo paciente$")
    public void que_Carlos_necesita_registrar_un_nuevo_paciente(String name) {
        this.name = name;
        theActor(name).attemptsTo(Open.browserOn(registrarPacientesPage));
    }
    @When("el realiza el registro del paciente en el aplicativo de Administracion de Hospitales")
    public void el_realiza_el_registro_del_paciente_en_el_aplicativo_de_Administracion_de_Hospitales(DataTable dataTable) {

        //El actor en la escena es capaz de registrar el paciente con los datos de la tabla
        OnStage.theActorCalled(name).wasAbleTo(RegistrarPaciente.WithData(dataTable));

    }

    //Escenario 3


    @Given("^que (.*) necesita asistir al medico$")
    public void que_Carlos_necesita_asistir_al_medico(String name) {

        this.name = name;

    }

    @When("el realiza el agendamiento de una Cita")
    public void el_realiza_el_agendamiento_de_una_Cita() {
        OnStage.theActorCalled(name).attemptsTo(PedirCita.PedirCita());

    }



}
