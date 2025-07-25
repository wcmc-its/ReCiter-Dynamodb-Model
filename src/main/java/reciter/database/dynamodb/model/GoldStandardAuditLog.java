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

	/** The user verbose. */
	private String userVerbose;
	
	/** The uid. */
	private String uid;
	
	/** The date time. */
	private Instant  dateTime;
	
	/** The pmids. */
	private List<Long> pmids;
	
	/** The action. */
	private PublicationFeedback action;

	/**
	 * Gets the uid.
	 *
	 * @return the uid
	 */
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}
	
	/**
	 * Gets the user verbose.
	 *
	 * @return the user verbose
	 */
	@DynamoDbAttribute("userVerbose")
	public String getUserVerbose() {
		return userVerbose;
	}
	
	/**
	 * Gets the date time.
	 *
	 * @return the date time
	 */
	@DynamoDbAttribute("dateTime")
	public Instant  getDateTime() {
		return dateTime;
	}
	
	/**
	 * Gets the pmids.
	 *
	 * @return the pmids
	 */
	@DynamoDbAttribute("pmids")
	public List<Long> getPmids() {
		return pmids;
	}
	
	/**
	 * Gets the action as string.
	 *
	 * @return the action as string
	 */
	@DynamoDbAttribute("action")
	public String getActionAsString() {
		return action != null ? action.toString() : null;
	}
}
