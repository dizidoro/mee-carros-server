package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import external.PipedriveClient;
import play.libs.Json;
import play.mvc.*;
import play.libs.ws.*;
import play.libs.ws.WSBodyReadables;

import java.util.concurrent.CompletionStage;
import javax.inject.Inject;

public class PersonController extends Controller implements WSBodyReadables, WSBodyWritables {
    private final PipedriveClient client;
//    private static String token = "fd5ee3c2519b3353b2f344a4c125a4e2fea4c396";

    @Inject
    public PersonController(PipedriveClient client) {
        this.client = client;
    }

    public CompletionStage<Result> persons(String pipedriveToken) {
        CompletionStage<Result> resultPromise = this.client.getPersons(pipedriveToken)
                .thenApply(personDTOS -> ok(Json.toJson(personDTOS)));
        return resultPromise;
    }

}
