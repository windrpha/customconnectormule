package cinepolis.connector;

import static org.mule.runtime.extension.api.annotation.param.MediaType.ANY;

import cinepolis.configuration.EntryClass;
import cinepolis.entity.CreateOrder;
import cinepolis.entity.Response;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;


/**
 * This class is a container for operations, every public method in this class will be taken as an extension operation.
 */
public class Orders_Operations {

  /**
   * Connector to start and order by connecting to Vista
   */
  @MediaType(value = ANY, strict = false)
  public Response startOrder(@Config Orders_Configuration configuration, @Connection Orders_Connection connection){

    EntryClass entryClass = new EntryClass();
    return entryClass.start(connection.getCinemaId(), connection.getToken());
  }

}
