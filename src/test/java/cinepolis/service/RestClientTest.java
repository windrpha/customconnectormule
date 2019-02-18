package cinepolis.service;

import cinepolis.configuration.AppConfiguration;
import cinepolis.configuration.EntryClass;
import cinepolis.entity.CreateOrder;
import cinepolis.entity.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfiguration.class})
public class RestClientTest {

    @Autowired
    private RestClient restClient;

    @Test
    public void restClient(){

        EntryClass entryClass = new EntryClass();
        Response response = entryClass.start("305","338a015455ec48558bf4dad932b77e95");
        System.out.println(response);
    }

}
