package task;

import interactions.ConsumeService;
import models.ModelCreateClientRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateClientRest implements Task {

    private  List<ModelCreateClientRest> modelCreateClientRestList;

    public CreateClientRest(List<ModelCreateClientRest> modelCreateClientRestList) {
        this.modelCreateClientRestList = modelCreateClientRestList;
    }

    public static CreateClientRest with(List<ModelCreateClientRest> modelCreateClientRestList) {
        return Tasks.instrumented(CreateClientRest.class, modelCreateClientRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(modelCreateClientRestList.get(0).toString());
        actor.attemptsTo(ConsumeService.withPost(modelCreateClientRestList.get(0).toString()));
    }
}
