package reciter.database.dynamodb.model;

public interface VersionedItem {

	int getSchemaVersion();
    void setSchemaVersion(int version);
}
