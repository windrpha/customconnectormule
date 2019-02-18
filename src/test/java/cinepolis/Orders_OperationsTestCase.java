package cinepolis;

import org.junit.Ignore;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.junit.Test;

public class Orders_OperationsTestCase extends MuleArtifactFunctionalTestCase {


  @Test
  @Ignore
  public void executeSayHiOperation() throws Exception {
    String payloadValue = ((String) flowRunner("startOrder").run()
                                      .getMessage()
                                      .getPayload()
                                      .getValue());
    System.out.println(payloadValue);
    //assertThat(payloadValue, is("Hello Mariano Gonzalez!!!"));
  }

}
