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

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ESearchResult {

	private String uid;
	private Instant  retrievalDate;
	private List<ESearchPmid> eSearchPmids;
	private QueryType queryType;
	

	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}
	@DynamoDbAttribute("retrievalDate")
	@DynamoDbConvertedBy(DateAttributeConverter.class)
	public Instant  getRetrievalDate() {
		return retrievalDate;
	}
	@DynamoDbAttribute("esearchpmids")
	@JsonProperty("esearchpmids")
	public List<ESearchPmid> getESearchPmids() {
		return eSearchPmids;
	}
	@DynamoDbAttribute("queryType")
	@JsonProperty("queryType")
	public QueryType getQueryType() {
		return queryType;
	}
}
