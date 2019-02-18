/*
package cinepolis.service;

import cinepolis.entity.CreateOrder;
import cinepolis.entity.Error;
import com.sun.jersey.api.client.ClientResponse;

import java.util.ArrayList;
import java.util.List;

public class Factory {


    public Object setObject(ClientResponse response){

        switch (response.getStatus()){

            case 201:
                return response.getEntity(CreateOrder.class);

            case 400:
                List<Error> list = new ArrayList<>();
                return  response.getEntity(list);

        }



    }


}
*/
