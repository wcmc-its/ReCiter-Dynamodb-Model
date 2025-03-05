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
public class InstitutionAfid {

	private String institution;
	private List<String> afids;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("institution")
	public String getInstitution() {
		return institution;
	}

	@DynamoDbAttribute("afids")
	public List<String> getAfids() {
		return afids;
	}

}
