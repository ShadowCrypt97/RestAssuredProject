package utils.enums;

public enum RestService {
    BASE_URL("http://localhost:8081"),
    CREATE_USER("/api/v1/student");
    private String uri;
    RestService(String uri) {
        this.uri = uri;
    }
    @Override
    public String toString() {
        return uri;
    }
}
