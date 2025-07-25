package reciter.database.dynamodb.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
/**
 * Represents the gold standard feedback information like knownPmids,rejectedPmidsauditLog.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class GoldStandard {

	 /**
     * Unique identifier for a user (e.g., researcher ID or institutional UID).
     * This is the partition key in DynamoDB.
     */
	private String uid;
	
	/**
     * Count of accepted publications.
     */
	private List<Long> knownPmids;
	
	/**
     * Count of rejected publications.
     */
	private List<Long> rejectedPmids;
	
	/** The audit log. */
	private List<GoldStandardAuditLog> auditLog;

	 /**
     * Gets the UID of the user (partition key).
     *
     * @return user identifier
     */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}
	
	 /**
     * Gets the count of accepted PubMed article for this person.
     *
     * @return list of PMIDs marked as known
     */
	@DynamoDbAttribute("knownpmids")
	public List<Long> getKnownPmids() {
		return knownPmids;
	}
	
	/**
     * Gets the count of rejected PubMed article IDs for this user.
     *
     * @return list of PMIDs marked as rejected
     */
	@DynamoDbAttribute("rejectedpmids")
	public List<Long> getRejectedPmids() {
		return rejectedPmids;
	}
	
	/**
	 * Gets the audit log.
	 *
	 * @return the audit log
	 */
	@DynamoDbAttribute("auditLog")
	public List<GoldStandardAuditLog> getAuditLog() {
		return auditLog;
	}
}
