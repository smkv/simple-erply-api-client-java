package ee.smkv.erply.api.client;

import ee.smkv.erply.api.client.models.VerifiedUser;
import ee.smkv.erply.api.client.responses.VerifyUserResponse;
import ee.smkv.erply.api.client.utils.StringUtils;

import java.util.Date;

public class Session {

    private final VerifiedUser verifiedUser;
    private final String key;
    private final Date startDate;
    private final Date endDate;


    Session(VerifyUserResponse verifyUserResponse) {
        verifiedUser = verifyUserResponse.first();
        key = verifiedUser.getSessionKey();
        startDate = verifyUserResponse.getStatus().getRequestUnixTime();
        endDate = new Date(startDate.getTime() + verifiedUser.getSessionLength());
    }

    public String getKey() {
        return key;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isValid() {
        Date now = new Date();
        return StringUtils.notEmpty(key) && startDate != null && startDate.compareTo(now) <= 0 && endDate != null && endDate.compareTo(now) > 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErplySession{");
        sb.append("key='").append(key).append('\'');
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
}
