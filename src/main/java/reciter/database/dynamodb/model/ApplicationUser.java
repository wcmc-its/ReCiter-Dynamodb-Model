package reciter.database.dynamodb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
/**
 * Represents a user of the ReCiter Publications Manager system.
 * <p>
 * This model is mapped to a DynamoDB table and stores basic authentication
 * credentials such as {@code username} and {@code password} for a user.
 * Typically used to authenticate and authorize access to the ReCiter UI or APIs.
 * </p>
 * @author ved4006
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ApplicationUser {

	/**
     * Unique identifier for the user. Acts as the DynamoDB partition key.
     */
	private String id;
	
	/**
     * Username of the user, used for login.
     */
	private String username;
	
	 /**
     * Password of the user (should be securely hashed before storage).
     */
	private String password;


    /**
     * Gets the user ID.
     *
     * @return the unique identifier of the user.
     */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("id")
	public String getId() {
		return id;
	}

	  /**
     * Gets the username of the user.
     *
     * @return the login username.
     */
	@DynamoDbAttribute("username")
	public String getUsername() {
		return username;
	}
	
	/**
     * Gets the password of the user.
     * 
     * @return the hashed password.
     */
	@DynamoDbAttribute("password")
	public String getPassword() {
		return password;
	}
}