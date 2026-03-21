package reciter.database.dynamodb.model;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@DynamoDBTable(tableName = "ApplicationUser")
@AllArgsConstructor
@NoArgsConstructor
public class ApplicationUser {
	
	@DynamoDBHashKey(attributeName = "id")
    private String id;
	@DynamoDBAttribute(attributeName = "username")
    private String username;
	@DynamoDBAttribute(attributeName = "password")
    private String password;
}
