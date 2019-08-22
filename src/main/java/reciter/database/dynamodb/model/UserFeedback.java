package reciter.database.dynamodb.model;

import java.util.Date;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@DynamoDBTable(tableName = "UserFeedback")
public class UserFeedback {
	
	@DynamoDBHashKey(attributeName = "uid")
	private String uid;
	@DynamoDBAttribute(attributeName = "acceptedPmids")
	private List<Double> acceptedPmids;
	@DynamoDBAttribute(attributeName = "rejectedPmids")
	private List<Double> rejectedPmids;
	@DynamoDBAttribute(attributeName = "feedbackDate")
	private Date feedbackDate; 
	
}
