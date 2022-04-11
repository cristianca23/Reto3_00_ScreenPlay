package starter.questions;

import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.navigation.CitasMedicasPage;

public class AnswerCitasMedicas {

    public static Question<String> validarGuardado(){

        return actor -> TextContent.of(CitasMedicasPage.DATA_SAVE).viewedBy(actor).asString().trim();
    }
}
