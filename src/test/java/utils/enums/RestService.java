package utils.enums;

public enum RestService {
    BASE_URL("http://localhost:5044"),
    CREATE_USER("/api/v1/ClientMS/Client/CreateClient");
    private String uri;
    RestService(String uri) {
        this.uri = uri;
    }
    @Override
    public String toString() {
        return uri;
    }
}
