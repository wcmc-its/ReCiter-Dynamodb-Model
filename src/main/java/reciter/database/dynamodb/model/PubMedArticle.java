package reciter.database.dynamodb.model;

import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
* DynamoDB model representing a PubMed article entry for persistence in AWS DynamoDB.
**<p>Each object of this class maps to a DynamoDB item where {@code pmid} is the partition key.</p>
*@author ved4006
*/
@Data
@DynamoDbBean
public class PubMedArticle {

	/**
     * The unique PubMed identifier (PMID) for the article.
     */
	private Long pmid;
	
	 /**
     * The full PubMed article details.
     * This field contains metadata such as title, authors, journal, MedlineCitationDate ,pubmodel etc.
     */
	private reciter.model.pubmed.PubMedArticle pubMedArticle;

	 /**
     * Default constructor for PubMedArticle.
     */
	public PubMedArticle() {
	}

	 /**
     * Constructs a PubMedArticle with a given PMID and corresponding parsed article data.
     *
     * @param pmid           the PubMed ID of the article
     * @param pubMedArticle  the full PubMed article object
     */
	public PubMedArticle(Long pmid, reciter.model.pubmed.PubMedArticle pubMedArticle) {
		this.pmid = pmid;
		this.pubMedArticle = pubMedArticle;
	}
	
	/**
	 * Gets the pmid.
	 *
	 * @return the pmid
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("pmid")
	public Long getPmid() {
		return pmid;
	}
	
	/**
	 * Gets the pub med article.
	 *
	 * @return the pub med article
	 */
	@DynamoDbAttribute("pubmedarticle")
	public reciter.model.pubmed.PubMedArticle getPubMedArticle() {
		return pubMedArticle;
	}
}
