package reciter.database.dynamodb.model;

import java.time.Instant;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reciter.model.typeconverter.DateAttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

/**
 * Represents PMID provenance information.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class PmidProvenance {

    /**
     * Unique identifier for the user.
     * This is the partition key in DynamoDB.
     */
    private String uid;

    /**
     * PubMed ID.
     * This is the sort key in DynamoDB.
     */
    private long pmid;

    /**
     * First retrieval date of the PMID.
     */
    private Instant firstRetrievalDate;

    /**
     * Retrieval strategy used.
     */
    private String retrievalStrategy;

    /**
     * Gets the user identifier (partition key).
     *
     * @return user identifier
     */
    @DynamoDbPartitionKey
    @DynamoDbAttribute("uid")
    public String getUid() {
        return uid;
    }

    /**
     * Gets the PubMed ID (sort key).
     *
     * @return PubMed ID
     */
    @DynamoDbSortKey
    @DynamoDbAttribute("pmid")
    public long getPmid() {
        return pmid;
    }

    /**
     * Gets the first retrieval date.
     *
     * @return first retrieval date
     */
    @DynamoDbConvertedBy(DateAttributeConverter.class)
    @DynamoDbAttribute("firstRetrievalDate")
    public Instant getFirstRetrievalDate() {
        return firstRetrievalDate;
    }

    /**
     * Gets the retrieval strategy.
     *
     * @return retrieval strategy
     */
    @DynamoDbAttribute("retrievalStrategy")
    public String getRetrievalStrategy() {
        return retrievalStrategy;
    }
}