package task;

import interactions.ConsumeService;
import models.ModelCreateStudentRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateStudentRest implements Task {

    private  List<ModelCreateStudentRest> modelCreateStudentRestList;

    public CreateStudentRest(List<ModelCreateStudentRest> modelCreateStudentRestList) {
        this.modelCreateStudentRestList = modelCreateStudentRestList;
    }

    public static CreateStudentRest with(List<ModelCreateStudentRest> modelCreateStudentRestList) {
        return Tasks.instrumented(CreateStudentRest.class, modelCreateStudentRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumeService.withPost(modelCreateStudentRestList.get(0).toString()));
    }
}
