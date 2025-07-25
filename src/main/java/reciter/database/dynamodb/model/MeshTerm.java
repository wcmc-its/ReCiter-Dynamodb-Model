package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents a Medical Subject Heading (MeSH) term used in PubMed/MEDLINE indexing,
 * along with its associated frequency count.
 * <p>
 * This model is designed for use with AWS DynamoDB via the Enhanced Client, allowing
 * the `mesh` field to be used as the primary partition key.
 * </p>
 * @author ved4006
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class MeshTerm {

	/**
	 * The MeSH term string (e.g., "Acetals").
	 */
	private String mesh;
	
	/**
	 * The number of times this MeSH term (e.g., 1337).
	 */
	private long count;

	/**
	 * Gets the mesh.
	 *
	 * @return the mesh
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("mesh")
	public String getMesh() {
		return mesh;
	}

	/**
	 * Gets the count.
	 *
	 * @return the count
	 */
	@DynamoDbAttribute("count")
	public long getCount() {
		return count;
	}

}