package ee.smkv.erply.api.client.models;

public class VerifiedUser {
    int userID;
    String userName;
    int employeeID;
    String employeeName;
    int groupID;
    String groupName;
    String sessionKey;
    long sessionLength;
    String loginUrl;
    String berlinPOSVersion;
    String berlinPOSAssetsURL;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public long getSessionLength() {
        return sessionLength;
    }

    public void setSessionLength(long sessionLength) {
        this.sessionLength = sessionLength;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getBerlinPOSVersion() {
        return berlinPOSVersion;
    }

    public void setBerlinPOSVersion(String berlinPOSVersion) {
        this.berlinPOSVersion = berlinPOSVersion;
    }

    public String getBerlinPOSAssetsURL() {
        return berlinPOSAssetsURL;
    }

    public void setBerlinPOSAssetsURL(String berlinPOSAssetsURL) {
        this.berlinPOSAssetsURL = berlinPOSAssetsURL;
    }

    @Override
    public String toString() {
        return "VerifiedUsed{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", employeeID=" + employeeID +
                ", employeeName='" + employeeName + '\'' +
                ", groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", sessionLength=" + sessionLength +
                ", loginUrl='" + loginUrl + '\'' +
                ", berlinPOSVersion='" + berlinPOSVersion + '\'' +
                ", berlinPOSAssetsURL='" + berlinPOSAssetsURL + '\'' +
                '}';
    }
}
