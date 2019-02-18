package cinepolis.configuration;

import cinepolis.entity.CreateOrder;
import cinepolis.entity.Response;
import cinepolis.service.RestClient;
import com.sun.jersey.api.client.ClientResponse;

public class EntryClass extends AbstractHandler<AppConfiguration> {

    public Response start(String cinemaId, String token){

        RestClient bean = getApplicationContext().getBean(RestClient.class);
        ClientResponse restClientResponse = bean.getRestClient(cinemaId, token);
        Response response = new Response();
        response.setStatus(restClientResponse.getStatus());
        switch(restClientResponse.getStatus()){

            case 201 :
                    response.setData(restClientResponse.getEntity(CreateOrder.class));
                    response.setMessage("Session Created");
                    return response;
            case 400 :
                    response.setData("Cinema " + cinemaId + " was not found");
                    response.setMessage(restClientResponse.getStatusInfo().toString());
                    return response;
            default:
                    response.setData("");
                    response.setMessage(restClientResponse.getStatusInfo().toString());
                    return response;

        }

    }

}
