package cinepolis.entity;

public class Order {

    private String cinemaId;
    private String userSessionId;

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getUserSessionId() {
        return userSessionId;
    }

    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "cinemaId='" + cinemaId + '\'' +
                ", userSessionId='" + userSessionId + '\'' +
                '}';
    }
}
