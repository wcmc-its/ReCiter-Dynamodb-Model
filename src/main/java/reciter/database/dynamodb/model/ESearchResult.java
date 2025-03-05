package reciter.database.dynamodb.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ESearchResult {

	private String uid;
	private Date retrievalDate;
	private List<ESearchPmid> eSearchPmids;
	private QueryType queryType;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}

	@DynamoDbAttribute("retrievalDate")
	@JsonProperty("retrievalDate")
	public Date getRetrievalDate() {
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
