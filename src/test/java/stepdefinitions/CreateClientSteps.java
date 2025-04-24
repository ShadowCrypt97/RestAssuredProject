package stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.ModelCreateClientRest;
import questions.LastResponseStatusCode;
import task.CreateClientRest;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.Constants.VALUE;

public class CreateClientSteps {

    @DataTableType
    public ModelCreateClientRest modelCreateStudentRest(Map<String, String> entry) {
        return new ModelCreateClientRest(
                entry.get("name"),
                LocalDate.parse(entry.get("birthday")),
                entry.get("email"),
                Integer.parseInt(entry.get("gender"))
                );
    }


    @When("you create a client")
    public void youCreateAClient(List<ModelCreateClientRest> modelCreateClientRestList) {
        theActorInTheSpotlight().attemptsTo(CreateClientRest.with(modelCreateClientRestList));
    }

    @Then("i should see the client created")
    public void iShouldSeeTheClientCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }
}
