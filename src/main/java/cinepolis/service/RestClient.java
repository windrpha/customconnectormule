package cinepolis.service;


import cinepolis.entity.CreateOrder;
import cinepolis.entity.Order;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.UriBuilder;

@Service
public class RestClient {

    @Autowired
    private Environment environment;

    private final Logger log = LoggerFactory.getLogger(RestClient.class);

    public ClientResponse getRestClient(String cinemaId, String token){

        log.info("{} {}", cinemaId, token);

        String url = environment.getProperty("client.hostname") + "/" + environment.getProperty("client.baseUrl") + "/orders";

        System.out.println(url);
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        WebResource webResource = client.resource(UriBuilder.fromUri(url).build());
        Order order = new Order();
        order.setCinemaId(cinemaId);

        ClientResponse response = webResource
                .header("Content-Type","application/json")
                .header("connectapitoken",token)
                .post(ClientResponse.class, order);

        log.info("{}", response);
        log.info("{}", response.getStatusInfo());
        log.info("{}", response.getStatus());

        return response;

    }

}
