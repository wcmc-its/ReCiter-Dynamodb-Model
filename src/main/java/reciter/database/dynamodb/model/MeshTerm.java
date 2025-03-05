package reciter.database.dynamodb.model;

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
public class MeshTerm {

	private String mesh;
	private long count;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("mesh")
	public String getMesh() {
		return mesh;
	}

	@DynamoDbAttribute("count")
	public long getCount() {
		return count;
	}

}
