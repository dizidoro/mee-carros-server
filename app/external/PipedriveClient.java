package external;

import com.fasterxml.jackson.databind.JsonNode;
import models.person.PersonDTO;
import play.libs.ws.*;
import play.libs.ws.WSBodyReadables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletionStage;
import javax.inject.Inject;

public class PipedriveClient implements WSBodyReadables, WSBodyWritables {

    private static final String baseURL = "https://companydomain.pipedrive.com/v1";

    private final WSClient ws;


    @Inject
    public PipedriveClient(WSClient ws) {
        this.ws = ws;
    }

    public CompletionStage<List<PersonDTO>> getPersons(String apiToken) {
        final String personsPath = "/persons";

        WSRequest request = ws.url(baseURL + personsPath);
        WSRequest complexRequest = request.addQueryParameter("api_token", apiToken);
        CompletionStage<List<PersonDTO>> responsePromise = complexRequest.get()
                .thenApply(wsResponse -> jsonToDTO(wsResponse.getBody(json())));
        return responsePromise;
    }

    private List<PersonDTO> jsonToDTO(JsonNode json){
        List<PersonDTO> personsDTOs = new ArrayList<>();
        JsonNode personsJson = json.path("data");
        for(JsonNode personJson: personsJson) {
            Long id = personJson.path("id").longValue();
            String name = personJson.path("name").textValue();
            personsDTOs.add(new PersonDTO(id, name));
        }
        return personsDTOs;
    }

}
