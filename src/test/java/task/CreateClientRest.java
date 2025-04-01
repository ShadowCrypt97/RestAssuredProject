package task;

import interactions.ConsumeService;
import models.ModelCreateClientRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateStudentRest implements Task {

    private  List<ModelCreateClientRest> modelCreateClientRestList;

    public CreateStudentRest(List<ModelCreateClientRest> modelCreateClientRestList) {
        this.modelCreateClientRestList = modelCreateClientRestList;
    }

    public static CreateStudentRest with(List<ModelCreateClientRest> modelCreateClientRestList) {
        return Tasks.instrumented(CreateStudentRest.class, modelCreateClientRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateClientRestList.get(0).toString()));
    }
}
