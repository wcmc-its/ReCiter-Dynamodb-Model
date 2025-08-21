package reciter.database.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;

import lombok.Data;

@Data
@DynamoDBTable(tableName = "PubMedArticle")
public class PubMedArticle {
	
	@DynamoDBHashKey(attributeName = "pmid")
    private Long pmid;
	@DynamoDBTyped(DynamoDBAttributeType.BOOL)
	@DynamoDBAttribute(attributeName = "s3StorageFlag")
	private boolean isUsingS3;
	@DynamoDBAttribute(attributeName = "pubmedarticle")
    private reciter.model.pubmed.PubMedArticle pubMedArticle;

    public PubMedArticle() {}

    public PubMedArticle(Long pmid, reciter.model.pubmed.PubMedArticle pubMedArticle) {
        this.pmid = pmid;
        this.pubMedArticle = pubMedArticle;
    }
}

