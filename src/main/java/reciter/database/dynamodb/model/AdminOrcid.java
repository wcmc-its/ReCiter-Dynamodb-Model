package reciter.database.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ved4006
 * Represents an Admin ORCID mapping in DynamoDB. Stores the ORCID associated
 * with a specific person identifier.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "AdminOrcid")
public class AdminOrcid {

	/**
	 * Unique identifier for the person.
	 */
	@DynamoDBHashKey(attributeName = "personIdentifier")
	private String personIdentifier;

	/**
	 * ORCID of the person.
	 */
	@DynamoDBAttribute(attributeName = "orcid")
	private String orcid;
}
