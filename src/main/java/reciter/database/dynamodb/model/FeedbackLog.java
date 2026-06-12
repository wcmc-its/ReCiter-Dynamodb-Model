package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;
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

//	@DynamoDbConvertedBy(FeedBackTypeConverter.class)
	@DynamoDbAttribute("feedback")
	public String getFeedback() {
		return feedback;
	}

	@DynamoDbAttribute("curatedBy")
	public int getCuratedBy() {
		return curatedBy;
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
	
	 enum Feedback {
	        ACCEPTED, REJECTED, PENDING
	    }

}