package reciter.database.dynamodb.model;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * @author szd2013
 * This class tracks the changes in gold standard specific to a user.
 *
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class GoldStandardAuditLog {

	private String userVerbose;
	private String uid;
	private Instant  dateTime;
	private List<Long> pmids;
	private PublicationFeedback action;

	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}
	@DynamoDbAttribute("userVerbose")
	public String getUserVerbose() {
		return userVerbose;
	}
	@DynamoDbAttribute("dateTime")
	public Instant  getDateTime() {
		return dateTime;
	}
	@DynamoDbAttribute("pmids")
	public List<Long> getPmids() {
		return pmids;
	}
	@DynamoDbAttribute("action")
	public String getActionAsString() {
		return action != null ? action.toString() : null;
	}
}
