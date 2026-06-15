package reciter.database.dynamodb.model;

/**
 * Represents a persistable item whose structure is versioned.
 * Implementations use the schema version to support data migrations
 * and backward compatibility across schema revisions.
 */
public interface VersionedItem {

	/**
     * Gets the schema version associated with this item.
     *
     * @return the schema version used to interpret the item's data.
     */
	
	int getSchemaVersion();
	
	/**
     * Sets the schema version associated with this item.
     *
     * @param version the schema version to assign to this item.
     */
    void setSchemaVersion(int version);
}