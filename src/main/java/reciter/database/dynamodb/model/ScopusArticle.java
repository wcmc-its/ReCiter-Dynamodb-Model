package reciter.database.dynamodb.model;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents a Scopus article entity stored in DynamoDB. This class maps to a
 * DynamoDB table using the enhanced client.
 * @author ved4006
 */

@Data
@DynamoDbBean
public class ScopusArticle {

	/**
	 * The unique identifier of the Scopus article.
	 */
	private String id;

	/**
	 * The Scopus article details.
	 */
	private reciter.model.scopus.ScopusArticle scopusArticle;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("id")
	public String getId() {
		return id;
	}

	/**
	 * Gets the scopus article details.
	 *
	 * @return the scopus article
	 */
	@DynamoDbAttribute("scopusarticle")
	public reciter.model.scopus.ScopusArticle getScopusArticle() {
		return scopusArticle;
	}

	/**
	 * Default constructor for ScopusArticle.
	 */
	public ScopusArticle() {
	}

	/**
	 * Constructs a ScopusArticle with the given ID and Scopus article.
	 *
	 * @param id            the unique identifier of the article
	 * @param scopusArticle the Scopus article data
	 */
	public ScopusArticle(String id, reciter.model.scopus.ScopusArticle scopusArticle) {
		this.id = id;
		this.scopusArticle = scopusArticle;
	}
}
