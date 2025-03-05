package reciter.database.dynamodb.model;

import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSecondaryPartitionKey;

@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDbBean
public class ScienceMetrix {

	@CsvBindByPosition(position = 0)
	private Long smsid;
	@CsvBindByPosition(position = 3)
	private String eissn;
	@CsvBindByPosition(position = 2)
	private String issn;
	@CsvBindByPosition(position = 1)
	private String publicationName;
	@CsvBindByPosition(position = 7)
	private String scienceMatrixSubfieldId;
	@CsvBindByPosition(position = 4)
	private String scienceMetrixDomain;
	@CsvBindByPosition(position = 5)
	private String scienceMetrixField;
	@CsvBindByPosition(position = 6)
	private String scienceMetrixSubfield;

	@DynamoDbAttribute("smsid")
	@DynamoDbPartitionKey
	public Long getSmsid() {
		return smsid;
	}

	@DynamoDbAttribute("eissn")
	@DynamoDbSecondaryPartitionKey(indexNames = "eissn-index")
	public String getEissn() {
		return eissn;
	}

	@DynamoDbAttribute("issn")
	@DynamoDbSecondaryPartitionKey(indexNames = "issn-index")
	public String getIssn() {
		return issn;
	}

	@DynamoDbAttribute("publicationName")
	public String getPublicationName() {
		return publicationName;
	}

	@DynamoDbAttribute("scienceMatrixSubfieldId")
	public String getScienceMatrixSubfieldId() {
		return scienceMatrixSubfieldId;
	}

	@DynamoDbAttribute("scienceMetrixDomain")
	public String getScienceMetrixDomain() {
		return scienceMetrixDomain;
	}

	@DynamoDbAttribute("scienceMetrixField")
	public String getScienceMetrixField() {
		return scienceMetrixField;
	}

	@DynamoDbAttribute("scienceMetrixSubfield")
	public String getScienceMetrixSubfield() {
		return scienceMetrixSubfield;
	}

}
