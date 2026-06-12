package reciter.database.dynamodb.model;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

/**
 * DynamoDB model for storing article provenance details updated for AWS SDK v2.
 *
 * @author ved4006
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@DynamoDbBean 
public class ArticleProvenance {

    private String uid;
    private String articleId;
    private String rs;
    private String src;
    private Long frd;
    private Set<String> ads;

    @DynamoDbPartitionKey 
    @DynamoDbAttribute("uid")
    public String getUid() {
        return uid;
    }

    @DynamoDbSortKey 
    @DynamoDbAttribute("articleId")
    public String getArticleId() {
        return articleId;
    }

    @DynamoDbAttribute("rs")
    public String getRs() {
        return rs;
    }

    @DynamoDbAttribute("src")
    public String getSrc() {
        return src;
    }

    @DynamoDbAttribute("frd")
    public Long getFrd() {
        return frd;
    }

    @DynamoDbAttribute("ads")
    public Set<String> getAds() {
        return ads;
    }
}