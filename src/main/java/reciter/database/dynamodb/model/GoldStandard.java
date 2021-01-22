package reciter.database.dynamodb.model;

import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBTable(tableName = "GoldStandard")
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class GoldStandard {
	
	@DynamoDBHashKey(attributeName = "uid")
    private String uid;
	@DynamoDBAttribute(attributeName = "knownpmids")
    private List<Long> knownPmids;
	@DynamoDBAttribute(attributeName = "rejectedpmids")
    private List<Long> rejectedPmids;
	@DynamoDBAttribute(attributeName = "auditLog")
	private List<GoldStandardAuditLog> auditLog;
	
}
