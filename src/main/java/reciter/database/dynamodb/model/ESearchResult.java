package reciter.database.dynamodb.model;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reciter.model.typeconverter.DateAttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents the result of an ESearch 
 *  <p>This model is stored in DynamoDB and includes metadata<p> .
 *  @author ved4006
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ESearchResult {

	/**
     * Unique identifier for the person .
     */
	private String uid;
	
	/**
    * The timestamp of when the ESearch retrieval was performed.
    */
	private Instant  retrievalDate;
	
	 /**
     * List of PMIDs (PubMed identifiers) returned by the ESearch query.
     */
	private List<ESearchPmid> eSearchPmids;
	
	 /** Type of query used for the ESearch. */
	private QueryType queryType;
	

	/**
	 * Gets the uid.
	 *
	 * @return the uid
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}
	
	/**
	 * Gets the retrieval date.
	 *
	 * @return the retrieval date
	 */
	@DynamoDbAttribute("retrievalDate")
	@DynamoDbConvertedBy(DateAttributeConverter.class)
	public Instant  getRetrievalDate() {
		return retrievalDate;
	}
	
	/**
	 * Gets the e search pmids.
	 *
	 * @return the e search pmids
	 */
	@DynamoDbAttribute("esearchpmids")
	@JsonProperty("esearchpmids")
	public List<ESearchPmid> getESearchPmids() {
		return eSearchPmids;
	}
	
	/**
	 * Gets the query type.
	 *
	 * @return the query type
	 */
	@DynamoDbAttribute("queryType")
	@JsonProperty("queryType")
	public QueryType getQueryType() {
		return queryType;
	}
}
