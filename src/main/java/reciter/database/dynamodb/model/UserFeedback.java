package reciter.database.dynamodb.model;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDbBean
public class UserFeedback {
	private String uid;
	private List<Double> acceptedPmids;
	private List<Double> rejectedPmids;
	private Date feedbackDate;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("uid")
	@JsonProperty("uid")
	public String getUid() {
		return uid;
	}

	@DynamoDbAttribute("acceptedPmids")
	@JsonProperty("acceptedPmids")
	public List<Double> getAcceptedPmids() {
		return acceptedPmids;
	}

	@DynamoDbAttribute("rejectedPmids")
	@JsonProperty("rejectedPmids")
	public List<Double> getRejectedPmids() {
		return rejectedPmids;
	}

	@DynamoDbAttribute("feedbackDate")
	@JsonProperty("feedbackDate")
	public Date getFeedbackDate() {
		return feedbackDate;
	}

}
