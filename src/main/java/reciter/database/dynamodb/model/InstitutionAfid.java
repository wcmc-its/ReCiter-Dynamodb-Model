package reciter.database.dynamodb.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * Represents a mapping between an institution and its associated affiliation identifiers (AFIDs).
 * @author ved4006
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class InstitutionAfid {

	/**
     * The name of the institution (e.g., "Weill Cornell Medical College, Cornell University").
     */
	private String institution;
	
	 /**
     * List of Affiliation IDs (AFIDs)(e.g, 108213503) .
     */
	private List<String> afids;
	
	/**
	 * Gets the institution.
	 *
	 * @return the institution
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("institution")
	public String getInstitution() {
		return institution;
	}
	
	/**
	 * Gets the afids.
	 *
	 * @return the afids
	 */
	@DynamoDbAttribute("afids")
	public List<String> getAfids() {
		return afids;
	}
}
