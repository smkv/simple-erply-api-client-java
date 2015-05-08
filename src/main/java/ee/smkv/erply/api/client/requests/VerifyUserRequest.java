package ee.smkv.erply.api.client.requests;

import ee.smkv.erply.api.client.responses.VerifyUserResponse;

public class VerifyUserRequest extends Request<VerifyUserResponse> {

    public static final String NAME = "verifyUser";

    public VerifyUserRequest(String username, String password) {
        super(NAME);
        addParameter("username", username);
        addParameter("password", password);
    }

    public void setSessionLength(long time) {
        addParameter("sessionLength", String.valueOf(time));
    }

    @Override
    public Class<VerifyUserResponse> getResponseClass() {
        return VerifyUserResponse.class;
    }
}
