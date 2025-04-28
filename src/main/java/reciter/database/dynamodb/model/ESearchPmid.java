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


@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class ESearchPmid {
	private List<Long> pmids;
	private String retrievalStrategyName;
	private Instant   retrievalDate;
	private RetrievalRefreshFlag lookupType;

	@DynamoDbAttribute("pmids")
	public List<Long> getPmids() {
		return pmids;
	}
	@DynamoDbAttribute("retrievalStrategyName")
	public String getRetrievalStrategyName() {
		return retrievalStrategyName;
	}
	@DynamoDbConvertedBy(DateAttributeConverter.class)
	@DynamoDbAttribute("retrievalDate")
	public Instant   getRetrievalDate() {
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
