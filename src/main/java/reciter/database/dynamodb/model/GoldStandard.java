package reciter.database.dynamodb.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class GoldStandard {

	private String uid;
	private List<Long> knownPmids;
	private List<Long> rejectedPmids;
	private List<GoldStandardAuditLog> auditLog;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}
	@DynamoDbAttribute("knownpmids")
	public List<Long> getKnownPmids() {
		return knownPmids;
	}
	@DynamoDbAttribute("rejectedpmids")
	public List<Long> getRejectedPmids() {
		return rejectedPmids;
	}
	@DynamoDbAttribute("auditLog")
	public List<GoldStandardAuditLog> getAuditLog() {
		return auditLog;
	}
}
