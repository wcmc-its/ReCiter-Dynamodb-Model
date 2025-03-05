package reciter.database.dynamodb.model;

import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class GenderTypeConverter implements AttributeConverter<GenderEnum> {

	 @Override
	    public AttributeValue transformFrom(GenderEnum input) {
	        return AttributeValue.builder().s(input.name()).build();
	    }

	 @Override
	    public GenderEnum transformTo(AttributeValue attributeValue) {
	        return GenderEnum.valueOf(attributeValue.s());
	    }

	@Override
	public EnhancedType<GenderEnum> type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeValueType attributeValueType() {
		// TODO Auto-generated method stub
		return null;
	}

}
