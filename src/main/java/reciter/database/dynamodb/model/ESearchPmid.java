package reciter.database.dynamodb.model;

import java.time.Instant;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reciter.model.typeconverter.DateAttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;

/**
 * The Class ESearchPmid.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class ESearchPmid {

	/** The pmids. */
	private List<Long> pmids;

	/** The retrieval strategy name. */
	private String retrievalStrategyName;

	/** The retrieval date. */
	private Instant retrievalDate;

	/** The lookup type. */
	private RetrievalRefreshFlag lookupType;

	/**
	 * Gets the pmids.
	 *
	 * @return the pmids
	 */
	@DynamoDbAttribute("pmids")
	public List<Long> getPmids() {
		return pmids;
	}

	/**
	 * Gets the retrieval strategy name.
	 *
	 * @return the retrieval strategy name
	 */
	@DynamoDbAttribute("retrievalStrategyName")
	public String getRetrievalStrategyName() {
		return retrievalStrategyName;
	}

	/**
	 * Gets the retrieval date.
	 *
	 * @return the retrieval date
	 */
	@DynamoDbConvertedBy(DateAttributeConverter.class)
	@DynamoDbAttribute("retrievalDate")
	public Instant getRetrievalDate() {
		return retrievalDate;
	}

	/**
	 * Gets the lookup type.
	 *
	 * @return the lookup type
	 */
	@DynamoDbAttribute("lookupType")
	@DynamoDbConvertedBy(RetrievalRefreshFlagConverter.class)
	public RetrievalRefreshFlag getLookupType() {
		return lookupType;
	}

	/**
	 * The Enum RetrievalRefreshFlag.
	 */
	public enum RetrievalRefreshFlag {

		/** The all publications. */
		ALL_PUBLICATIONS,
		/** The only newly added publications. */
		ONLY_NEWLY_ADDED_PUBLICATIONS,
		/** The false. */
		FALSE
	}
}
