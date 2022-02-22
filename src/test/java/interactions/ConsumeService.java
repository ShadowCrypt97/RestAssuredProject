package interactions;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Tasks;


public class ConsumeService {

    public ConsumeService() {
    }

    public static WhitPost withPost(String body){
        return Tasks.instrumented(WhitPost.class,body);
    }
}
