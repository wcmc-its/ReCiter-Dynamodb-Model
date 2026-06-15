package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents ESearch count information for a user.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ESearchCount {

    /**
     * Unique identifier for the user.
     * This is the partition key in DynamoDB.
     */
    private String uid;

    /**
     * Number of ESearch operations performed.
     */
    private int eSearchCount;

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
     * Gets the ESearch count.
     *
     * @return ESearch count
     */
    @DynamoDbAttribute("eSearchCount")
    public int getESearchCount() {
        return eSearchCount;
    }
}