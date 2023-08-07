package api.api;

public class AuthResponse {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    private String email;
    private String accessToken;

    public AuthResponse(){

    }

    public AuthResponse(String email, String accessToken){
        this.email = email;
        this.accessToken = accessToken;
    }
}
