package test_project.fptrade;

public class APIHeaderRequest {
    private String sessionToken;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public APIHeaderRequest(String token) {
        sessionToken = token;
    }
}
