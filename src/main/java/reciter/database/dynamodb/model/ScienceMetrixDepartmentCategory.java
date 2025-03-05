package reciter.database.dynamodb.model;

import com.opencsv.bean.CsvBindByPosition;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@Data
@DynamoDbBean
@NoArgsConstructor
@AllArgsConstructor
public class ScienceMetrixDepartmentCategory {

	@CsvBindByPosition(position = 0)
	private int pk;
	@CsvBindByPosition(position = 1)
	private double logOddsRatio;
	@CsvBindByPosition(position = 2)
	private String primaryDepartment;
	@CsvBindByPosition(position = 3)
	private String scienceMetrixJournalSubfield;
	@CsvBindByPosition(position = 4)
	private int scienceMetrixJournalSubfieldId;

	@DynamoDbPartitionKey
	@DynamoDbAttribute("pk")
	public int getPk() {
		return pk;
	}

	@DynamoDbAttribute("logOddsRatio")
	public double getLogOddsRatio() {
		return logOddsRatio;
	}

	@DynamoDbAttribute("primaryDepartment")
	public String getPrimaryDepartment() {
		return primaryDepartment;
	}

	@DynamoDbAttribute("scienceMetrixJournalSubfield")
	public String getScienceMetrixJournalSubfield() {
		return scienceMetrixJournalSubfield;
	}

	@DynamoDbAttribute("scienceMetrixJournalSubfieldId")
	public int getScienceMetrixJournalSubfieldId() {
		return scienceMetrixJournalSubfieldId;
	}

}
