package starter.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.RegistrarPacientesPage;
import com.github.javafaker.Faker;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarPaciente implements Task {

    RegistrarPacientesPage registrarPacientesPage;
    private final DataTable dataTable;

    public RegistrarPaciente(DataTable dataTable) {
        this.dataTable = dataTable;
    }
    protected Faker faker = new Faker();

    public static Performable WithData(DataTable dataTable){

        return instrumented(RegistrarPaciente.class, dataTable);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(registrarPacientesPage),
                Click.on(RegistrarPacientesPage.AGREGAR_PACIENTE),
                Enter.theValue(dataTable.cell(1,0)).into(RegistrarPacientesPage.TEXTBOX_NOMBRE),
                Enter.theValue(dataTable.cell(1,1)).into(RegistrarPacientesPage.TEXTBOX_APELLIDO),
                Enter.theValue(dataTable.cell(1,2)).into(RegistrarPacientesPage.TEXTBOX_TELEFONO),
                Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+faker.number().numberBetween(1000000,9999999))).into(RegistrarPacientesPage.TEXBOX_CC),
                Click.on(RegistrarPacientesPage.CHECKBOX_PREPAGADA),
                Click.on(RegistrarPacientesPage.BUTTON_GUARDAR)

        );

    }
}
