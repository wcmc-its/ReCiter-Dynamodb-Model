package reciter.database.dynamodb.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean

/**
 * Represents a DynamoDB record that associates a unique user identifier (UID)
 * with an {@link reciter.model.identity.Identity} object containing detailed person information.
 *
 * <p>This class is annotated for AWS SDK v2 DynamoDB Enhanced Client and is used for
 * storing identity resolution metadata per user in DynamoDB.</p>
 * @author ved4006
 */

public class Identity {
	
	/**
     * Unique identifier for the person.
     * This serves as the primary partition key in DynamoDB.
     */
	private String uid;
	
	/**
     * Represent the Identity  profile information such as:
     * primaryName,gender
     * knownRelationships,title
     * degreeYear, etc.
     */
    private reciter.model.identity.Identity identity;
    
    /**
     * Gets the UID used as the primary key in DynamoDB.
     *
     * @return the unique identifier string.
     */
    @DynamoDbPartitionKey
    @DynamoDbAttribute("uid")
    public String getUid() {
        return uid;
    }
    
    /**
     * Gets the {@link reciter.model.identity.Identity} object associated with the UID.
     *
     * @return an Identity object containing person profile metadata.
     */
    @DynamoDbAttribute("identity")
    public reciter.model.identity.Identity getIdentity() {
		return identity;
	}
    
}
