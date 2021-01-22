package reciter.database.dynamodb.model;

import java.util.Date;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author szd2013
 * This class tracks the changes in gold standard specific to a user.
 *
 */
@Builder
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@DynamoDBDocument
@NoArgsConstructor
@AllArgsConstructor
public class GoldStandardAuditLog {
	
	private String userVerbose;
	private String uid;
	private Date dateTime; 
	private List<Long> pmids;
	@DynamoDBTyped(DynamoDBAttributeType.S)
	private PublicationFeedback action;
	
	
}
