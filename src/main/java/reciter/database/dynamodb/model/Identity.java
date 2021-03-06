package reciter.database.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@DynamoDBTable(tableName = "Identity")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@AllArgsConstructor
@NoArgsConstructor
public class Identity {
	@DynamoDBHashKey(attributeName = "uid")
    private String uid;
	@DynamoDBAttribute(attributeName = "identity")
    private reciter.model.identity.Identity identity;
}
