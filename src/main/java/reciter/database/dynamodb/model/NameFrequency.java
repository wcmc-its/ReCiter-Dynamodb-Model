package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents name frequency statistics.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class NameFrequency {

    /**
     * Name value used as partition key.
     */
    private String name;

    /**
     * Total occurrence count.
     */
    private int count;

    /**
     * Percentile value.
     */
    private double percentile;

    /**
     * Calculated score.
     */
    private double score;

    /**
     * Gets the name (partition key).
     *
     * @return name
     */
    @DynamoDbPartitionKey
    @DynamoDbAttribute("name")
    public String getName() {
        return name;
    }

    /**
     * Gets the count.
     *
     * @return count
     */
    @DynamoDbAttribute("count")
    public int getCount() {
        return count;
    }

    /**
     * Gets the percentile.
     *
     * @return percentile
     */
    @DynamoDbAttribute("percentile")
    public double getPercentile() {
        return percentile;
    }

    /**
     * Gets the score.
     *
     * @return score
     */
    @DynamoDbAttribute("score")
    public double getScore() {
        return score;
    }
}