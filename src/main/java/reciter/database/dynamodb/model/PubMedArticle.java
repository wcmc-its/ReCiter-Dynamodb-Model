package reciter.database.dynamodb.model;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@DynamoDbBean
public class PubMedArticle {

	private Long pmid;
	private reciter.model.pubmed.PubMedArticle pubMedArticle;

	public PubMedArticle() {
	}

	public PubMedArticle(Long pmid, reciter.model.pubmed.PubMedArticle pubMedArticle) {
		this.pmid = pmid;
		this.pubMedArticle = pubMedArticle;
	}
	@DynamoDbPartitionKey
	@DynamoDbAttribute("pmid")
	public Long getPmid() {
		return pmid;
	}
	@DynamoDbAttribute("pubmedarticle")
	public reciter.model.pubmed.PubMedArticle getPubMedArticle() {
		return pubMedArticle;
	}
}
