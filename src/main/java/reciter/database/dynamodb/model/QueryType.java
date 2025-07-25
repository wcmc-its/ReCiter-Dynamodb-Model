package reciter.database.dynamodb.model;

/**
 * The Enum QueryType.
 * @author ved4006
 */
public enum QueryType {

	/** The lenient lookup. */
	LENIENT_LOOKUP,

	/** The strict compound name lookup. */
	STRICT_COMPOUND_NAME_LOOKUP,

	/** The strict exceeds threshold lookup. */
	STRICT_EXCEEDS_THRESHOLD_LOOKUP
}
