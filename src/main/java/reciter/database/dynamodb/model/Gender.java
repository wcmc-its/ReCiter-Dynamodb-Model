package reciter.database.dynamodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbConvertedBy;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

/**
 * @author szd2013
 * This contains different gender probability list attributed from different sources
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class Gender {
	
	
	private String uniqueId;
	
	
	/**
	 * Name of the person, usually first name. <i>e.g. <b>Aban, Paul, Nancy </b></i>
	 */
	private String name;
	
	/**
	 * Gender of the person
	 */
	private GenderEnum gender;
	/**
	 * The probability of the person to be male for female. <i>e.g. <b>"probability": 0.998814604077762</b></i>
	 */
	private double probability;
	
	
	
	@DynamoDbPartitionKey
	@DynamoDbAttribute("uniqueId")
	public String getUniqueId() {
		return uniqueId;
	}

	@DynamoDbAttribute("name")
	@JsonProperty(value = "name")
	public String getName() {
		return name;
	}

	@DynamoDbAttribute("gender")
	@JsonProperty(value = "gender")
	@DynamoDbConvertedBy(GenderTypeConverter.class)
	public GenderEnum getGender() {
		return gender;
	}

	@DynamoDbAttribute("probability")
	@JsonProperty(value = "probability")
	public double getProbability() {
		return probability;
	}

	
}
