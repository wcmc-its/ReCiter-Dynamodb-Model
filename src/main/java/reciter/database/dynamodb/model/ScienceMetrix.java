package reciter.database.dynamodb.model;

import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondaryPartitionKey;

/**
* Represents a Science-Metrix classification entry for a journal or publication.
* @author ved4006
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class ScienceMetrix {

	/**
     * Unique identifier for the Science-Metrix record.
     * This serves as the primary key in the DynamoDB table.
     *
     * CSV column index: 0
     */
	@CsvBindByPosition(position = 0)
	private Long smsid;
	
	/**
     * International Standard Serial Number (ISSN) for the online or electronic version of a journal
     * This is a secondary partition key for the "eissn-index" in DynamoDB.
     *
     * CSV column index: 3
     */
	
	@CsvBindByPosition(position = 3)
	private String eissn;
	
	
	 /**
     *The International Standard Serial Number (ISSN) assigned to each journal,
     * This is a secondary partition key for the "issn-index" in DynamoDB.
     *
     * CSV column index: 2
     */
	@CsvBindByPosition(position = 2)
	private String issn;
	
	 /**
     * Full name of the journal or publication.
     * 
     * CSV column index: 1
     */
	@CsvBindByPosition(position = 1)
	private String publicationName;
	
	 /**
     * Science-Metrix subfield identifier.
     * This is a unique string representing the journal’s classified subfield.
     *
     * CSV column index: 7
     */
	@CsvBindByPosition(position = 7)
	private String scienceMatrixSubfieldId;
	
	 /** Domain as per Science-Metrix classification  CSV column index: 4. */
	@CsvBindByPosition(position = 4)
	private String scienceMetrixDomain;
	
	/** The Name of the science Metrix Field  CSV column index: 5. */
	@CsvBindByPosition(position = 5)
	private String scienceMetrixField;
	
	/**
     *  Subfield under the Science-Metrix classification (e.g., Cardiology).
     *
     * CSV column index: 6
     */
	@CsvBindByPosition(position = 6)
	private String scienceMetrixSubfield;

	/**
     * Gets the unique Science-Metrix identifier.
     *
     * @return smsid - the primary key for this record.
     */
	@DynamoDbAttribute("smsid")
	@DynamoDbPartitionKey
	public Long getSmsid() {
		return smsid;
	}
	
	/**
     * Gets the electronic ISSN.
     *
     * @return eissn - electronic ISSN of the journal.
     */
	@DynamoDbAttribute("eissn")
	@DynamoDbSecondaryPartitionKey(indexNames = "eissn-index")
	public String getEissn() {
		return eissn;
	}
	/**
     * Gets the  ISSN.
     *
     * @return issn - print ISSN of the journal.
     */
	@DynamoDbAttribute("issn")
	@DynamoDbSecondaryPartitionKey(indexNames = "issn-index")
	public String getIssn() {
		return issn;
	}
	 /**
     * Gets the publication name.
     *
     * @return publicationName - full name of the journal or publication.
     */
	@DynamoDbAttribute("publicationName")
	public String getPublicationName() {
		return publicationName;
	}
	
	/**
	 * Gets the science matrix subfield id.
	 *
	 * @return the science matrix subfield id
	 */
	@DynamoDbAttribute("scienceMatrixSubfieldId")
	public String getScienceMatrixSubfieldId() {
		return scienceMatrixSubfieldId;
	}
	
	/**
	 * Gets the science metrix domain.
	 *
	 * @return the science metrix domain
	 */
	@DynamoDbAttribute("scienceMetrixDomain")
	public String getScienceMetrixDomain() {
		return scienceMetrixDomain;
	}
	
	/**
	 * Gets the science metrix field.
	 *
	 * @return the science metrix field
	 */
	@DynamoDbAttribute("scienceMetrixField")
	public String getScienceMetrixField() {
		return scienceMetrixField;
	}
	
	/**
	 * Gets the science metrix subfield.
	 *
	 * @return the science metrix subfield
	 */
	@DynamoDbAttribute("scienceMetrixSubfield")
	public String getScienceMetrixSubfield() {
		return scienceMetrixSubfield;
	}
}
