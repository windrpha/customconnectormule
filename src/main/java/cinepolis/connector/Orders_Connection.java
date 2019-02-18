package cinepolis.connector;


/**
 * This class represents an extension connection just as example (there is no real connection with anything here c:).
 */
public final class Orders_Connection {

  private final String cinemaId;
  private final String token;

  public Orders_Connection(String cinemaId, String token) {
    this.cinemaId = cinemaId;
    this.token = token;
  }

  public String getCinemaId() {
    return cinemaId;
  }

  public String getToken() {
    return token;
  }
}
