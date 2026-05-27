package reciter.database.dynamodb.model;

import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DynamoDB model for storing article provenance details.
 *
 * @author ved4006
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamoDBTable(tableName = "ArticleProvenance")
public class ArticleProvenance {

    @DynamoDBHashKey(attributeName = "uid")
    private String uid;

    @DynamoDBRangeKey(attributeName = "articleId")
    private String articleId;

    @DynamoDBAttribute(attributeName = "rs")
    private String rs;

    @DynamoDBAttribute(attributeName = "src")
    private String src;

    @DynamoDBAttribute(attributeName = "frd")
    private Long frd;

    @DynamoDBAttribute(attributeName = "ads")
    private Set<String> ads;
}