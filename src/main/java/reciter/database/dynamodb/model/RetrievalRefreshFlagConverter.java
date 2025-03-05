package reciter.database.dynamodb.model;

import reciter.database.dynamodb.model.ESearchPmid.RetrievalRefreshFlag;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class RetrievalRefreshFlagConverter implements AttributeConverter<ESearchPmid.RetrievalRefreshFlag> {

	 @Override
	    public AttributeValue transformFrom(ESearchPmid.RetrievalRefreshFlag input) {
	        return AttributeValue.builder().s(input.name()).build();
	    }

	 @Override
	    public ESearchPmid.RetrievalRefreshFlag transformTo(AttributeValue attributeValue) {
	        return ESearchPmid.RetrievalRefreshFlag.valueOf(attributeValue.s());
	    }

	@Override
	public EnhancedType<RetrievalRefreshFlag> type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttributeValueType attributeValueType() {
		// TODO Auto-generated method stub
		return null;
	}

}
