package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static utils.enums.RestService.BASE_URL;
import static utils.enums.RestService.CREATE_USER;


public class WhitPost implements Interaction{

    private String body;

    public WhitPost(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(CREATE_USER.toString())
                .with(requestSpecification -> requestSpecification.baseUri(BASE_URL.toString())
                        .headers("Content-Type", "application/json")
                        .body(body)));

    }
}
