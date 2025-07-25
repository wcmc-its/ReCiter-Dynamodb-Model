package reciter.database.dynamodb.model;

import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 *  Represents a department-level categorization using the Science-Metrix classification.
 *  @author ved4006
 */
@Data
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class ScienceMetrixDepartmentCategory {

	/** Primary key representing the  unique identifier for the mapping record. */
	@CsvBindByPosition(position = 0)
	private int pk;
	
	 /**
     * The log odds are the logarithm of the odds ratio.
     * CSV position: 1
     */
	@CsvBindByPosition(position = 1)
	private double logOddsRatio;
	
	 /**
     * The name of the primary academic or research department.
     * For example: "Cardiology", "Biomedical Informatics".
     * 
     * CSV column position: 2
     */
	@CsvBindByPosition(position = 2)
	private String primaryDepartment;
	
	/**
     * The name of the subfields Science-Metrix classification.
     * 
     * CSV column position: 3
     */
	@CsvBindByPosition(position = 3)
	private String scienceMetrixJournalSubfield;
	
	 /**
     * The unique numeric ID representing a Science-Metrix journal subfield.
     * 
     * CSV column position: 4
     */
	@CsvBindByPosition(position = 4)
	private int scienceMetrixJournalSubfieldId;
	
	
	/**
	 * Gets the Primary key.
	 *
	 * @return the Primary key
	 */
	@DynamoDbPartitionKey
	@DynamoDbAttribute("pk")
	public int getPk() {
		return pk;
	}
	
	/**
	 * Gets the log odds ratio.
	 *
	 * @return the log odds ratio
	 */
	@DynamoDbAttribute("logOddsRatio")
	public double getLogOddsRatio() {
		return logOddsRatio;
	}
	
	/**
	 * Gets the primary department.
	 *
	 * @return the primary department
	 */
	@DynamoDbAttribute("primaryDepartment")
	public String getPrimaryDepartment() {
		return primaryDepartment;
	}
	
	/**
	 * Gets the science metrix journal subfield.
	 *
	 * @return the science metrix journal subfield
	 */
	@DynamoDbAttribute("scienceMetrixJournalSubfield")
	public String getScienceMetrixJournalSubfield() {
		return scienceMetrixJournalSubfield;
	}
	
	/**
	 * Gets the science metrix journal subfield id.
	 *
	 * @return the science metrix journal subfield id
	 */
	@DynamoDbAttribute("scienceMetrixJournalSubfieldId")
	public int getScienceMetrixJournalSubfieldId() {
		return scienceMetrixJournalSubfieldId;
	}
}
