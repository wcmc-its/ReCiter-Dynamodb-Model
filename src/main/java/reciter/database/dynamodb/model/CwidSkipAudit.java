package reciter.database.dynamodb.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

/**
 * Generic, reusable, write-once audit row recording that a CWID was skipped by some job.
 * Partition key {@code cwid} identifies the skipped person; sort key {@code eventTimestamp}
 * is the ISO-8601 UTC START time of the job run that skipped the cwid, as supplied by the
 * calling client — it is NOT the time this row was persisted. {@code createdTimestamp} is
 * the server-set persistence time. {@code source} identifies the calling system (e.g.
 * {@code institutional-client}). The DynamoDB table name is this class's simple name,
 * {@code CwidSkipAudit}.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class CwidSkipAudit {

	@NotBlank
	private String cwid;

	@NotBlank
	private String eventTimestamp;

	@NotBlank
	private String skipReason;

	@NotBlank
	private String source;

	private String processingStatus;

	private String errorDetails;

	private String createdTimestamp;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("cwid")
	public String getCwid() {
		return cwid;
	}

	@DynamoDbSortKey
	@DynamoDbAttribute("eventTimestamp")
	public String getEventTimestamp() {
		return eventTimestamp;
	}

	@DynamoDbAttribute("skipReason")
	public String getSkipReason() {
		return skipReason;
	}

	@DynamoDbAttribute("source")
	public String getSource() {
		return source;
	}

	@DynamoDbAttribute("processingStatus")
	public String getProcessingStatus() {
		return processingStatus;
	}

	@DynamoDbAttribute("errorDetails")
	public String getErrorDetails() {
		return errorDetails;
	}

	@DynamoDbAttribute("createdTimestamp")
	public String getCreatedTimestamp() {
		return createdTimestamp;
	}

}
