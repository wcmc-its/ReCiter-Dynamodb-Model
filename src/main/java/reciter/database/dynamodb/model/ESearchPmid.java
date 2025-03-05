package reciter.database.dynamodb.model;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;

@DynamoDbBean
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ESearchPmid {
	private List<Long> pmids;
	private String retrievalStrategyName;
	private Date retrievalDate;
	private RetrievalRefreshFlag lookupType;

	@DynamoDbAttribute("pmids")
	public List<Long> getPmids() {
		return pmids;
	}

	@DynamoDbAttribute("retrievalStrategyName")
	public String getRetrievalStrategyName() {
		return retrievalStrategyName;
	}

	@DynamoDbAttribute("retrievalDate")
	public Date getRetrievalDate() {
		return retrievalDate;
	}

	@DynamoDbAttribute("lookupType")
	@DynamoDbConvertedBy(RetrievalRefreshFlagConverter.class)
	public RetrievalRefreshFlag getLookupType() {
		return lookupType;
	}

	public enum RetrievalRefreshFlag {
		ALL_PUBLICATIONS, ONLY_NEWLY_ADDED_PUBLICATIONS, FALSE
	}
}
