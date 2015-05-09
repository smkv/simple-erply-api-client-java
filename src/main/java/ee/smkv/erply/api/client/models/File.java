package ee.smkv.erply.api.client.models;

public class File {
    
    private Integer fileID;
    private String name;
    private Integer typeID;
    private Integer typeName;
    private Boolean isInformationFile;
    private String fileURL;
    private Boolean external;
    private String hostingProvider;

    public Integer getFileID() {
        return fileID;
    }

    public void setFileID(Integer fileID) {
        this.fileID = fileID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeID() {
        return typeID;
    }

    public void setTypeID(Integer typeID) {
        this.typeID = typeID;
    }

    public Integer getTypeName() {
        return typeName;
    }

    public void setTypeName(Integer typeName) {
        this.typeName = typeName;
    }

    public Boolean getIsInformationFile() {
        return isInformationFile;
    }

    public void setIsInformationFile(Boolean isInformationFile) {
        this.isInformationFile = isInformationFile;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public Boolean getExternal() {
        return external;
    }

    public void setExternal(Boolean external) {
        this.external = external;
    }

    public String getHostingProvider() {
        return hostingProvider;
    }

    public void setHostingProvider(String hostingProvider) {
        this.hostingProvider = hostingProvider;
    }
}
