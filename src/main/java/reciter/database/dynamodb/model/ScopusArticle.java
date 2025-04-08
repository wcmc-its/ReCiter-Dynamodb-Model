package reciter.database.dynamodb.model;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@DynamoDbBean
public class ScopusArticle {

	private String id;
	private reciter.model.scopus.ScopusArticle scopusArticle;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("id")
	public String getId() {
		return id;
	}
	@DynamoDbAttribute("scopusarticle")
	public reciter.model.scopus.ScopusArticle getScopusArticle() {
		return scopusArticle;
	}
	public ScopusArticle() {
	}
	public ScopusArticle(String id, reciter.model.scopus.ScopusArticle scopusArticle) {
		this.id = id;
		this.scopusArticle = scopusArticle;
	}
}
