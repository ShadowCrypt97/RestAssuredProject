package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ModelCreateStudentRest;
import org.asciidoctor.ast.Author;
import questions.LastResponseStatusCode;
import task.CreateStudentRest;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.Constants.VALUE;

public class CreateStudentSteps {

    @DataTableType
    public ModelCreateStudentRest modelCreateStudentRest(Map<String, String> entry) {
        return new ModelCreateStudentRest(
                entry.get("name"),
                LocalDate.parse(entry.get("dateOfBirth")),
                entry.get("email"));
    }


    @When("you create an student")
    public void youCreateAnStudent(List<ModelCreateStudentRest> modelCreateStudentRestList) {
        theActorInTheSpotlight().attemptsTo(CreateStudentRest.with(modelCreateStudentRestList));
    }

    @Then("i should see the student created")
    public void iShouldSeeTheStudentCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
