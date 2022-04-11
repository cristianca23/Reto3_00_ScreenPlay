package starter.tasks;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.CitasMedicasPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActor;

public class OpenCitasMedicas implements Task {

    CitasMedicasPage citasMedicasPage;

    protected Faker faker = new Faker();

    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String documento;

    public OpenCitasMedicas(String nombre, String apellido, String telefono, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.documento = documento;
    }

    public static Performable WithData(String nombre, String apellido, String telefono, String documento){

        return instrumented(OpenCitasMedicas.class, nombre, apellido, telefono, documento);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn(citasMedicasPage),
                Click.on(CitasMedicasPage.AGREGAR_DOCTOR),
                Enter.theValue(nombre).into(CitasMedicasPage.TEXTBOX_NOMBRE),
                Enter.theValue(apellido).into(CitasMedicasPage.TEXBOX_APELLIDO),
                Enter.theValue("3" +  faker.number().randomDigitNotZero() +faker.number().digits(9)).into(CitasMedicasPage.TEXTBOX_TELEFONO),
                Enter.theValue(String.valueOf(faker.number().randomDigitNotZero()+ faker.number().numberBetween(100000000, 99999999))).into(CitasMedicasPage.TEXTBOX_CC),
                Click.on(CitasMedicasPage.BUTTON_GUARDAR)

                );

    }
}
