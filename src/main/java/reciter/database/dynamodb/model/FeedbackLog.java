package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class FeedbackLog {

	private String uid;
	private String sk;
	private String articleId;
	private String feedback;
	private int curatedBy;

	/**
	 * CWID of the person who performed the action ({@code Person.personIdentifier}
	 * namespace — curators and faculty alike). Additive and nullable: rows written
	 * before this field existed carry only the narrower {@link #curatedBy}
	 * ({@code admin_users.userID}).
	 */
	private String actorPersonIdentifier;

	/** Optional free-text note attached to the action (e.g. a faculty member's dispute reason). */
	private String note;

	private String src;
	private long createTimestamp;
	private long modifyTimestamp;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	public String getUid() {
		return uid;
	}

	@DynamoDbSortKey
	@DynamoDbAttribute("sk")
	public String getSk() {
		return sk;
	}

	@DynamoDbAttribute("articleId")
	public String getArticleId() {
		return articleId;
	}

	@DynamoDbAttribute("feedback")
	public String getFeedback() {
		return feedback;
	}

	@DynamoDbAttribute("curatedBy")
	public int getCuratedBy() {
		return curatedBy;
	}

	@DynamoDbAttribute("actorPersonIdentifier")
	public String getActorPersonIdentifier() {
		return actorPersonIdentifier;
	}

	@DynamoDbAttribute("note")
	public String getNote() {
		return note;
	}

	@DynamoDbAttribute("src")
	public String getSrc() {
		return src;
	}

	@DynamoDbAttribute("createTimestamp")
	public long getCreateTimestamp() {
		return createTimestamp;
	}

	@DynamoDbAttribute("modifyTimestamp")
	public long getModifyTimestamp() {
		return modifyTimestamp;
	}

}