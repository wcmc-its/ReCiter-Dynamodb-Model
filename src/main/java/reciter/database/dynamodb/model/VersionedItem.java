package reciter.database.dynamodb.model;

public interface VersionedItem {

	String getSchemaVersion();
    void setSchemaVersion(String version);
}
