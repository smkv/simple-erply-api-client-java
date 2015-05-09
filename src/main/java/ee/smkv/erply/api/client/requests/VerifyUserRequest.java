package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.VerifyUserResponse;

public class VerifyUserRequest extends Request<VerifyUserResponse> {

    private final String username;
    private final String password;
    private Long sessionLength;

    public VerifyUserRequest(String username, String password) {
        super("verifyUser");
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Long getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(Long sessionLength) {
        this.sessionLength = sessionLength;
    }

    @Override
    public Class<VerifyUserResponse> getResponseClass() {
        return VerifyUserResponse.class;
    }
}
