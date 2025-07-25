package reciter.database.dynamodb.model;

import reciter.database.dynamodb.model.ESearchPmid.RetrievalRefreshFlag;
import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

/**
* A custom DynamoDB {@link AttributeConverter} for converting
* {@link ESearchPmid.RetrievalRefreshFlag} enum values to and from
* {@link AttributeValue} of type String.
*
* <p>This converter allows the DynamoDB Enhanced Client to persist and retrieve
* {@code RetrievalRefreshFlag} values as string attributes, enabling seamless
* object mapping for enum types in your data model.
*/
public class RetrievalRefreshFlagConverter implements AttributeConverter<ESearchPmid.RetrievalRefreshFlag> {

	/**
    * Converts a {@link RetrievalRefreshFlag} enum to a DynamoDB {@link AttributeValue}.
    *
    * @param input the {@code RetrievalRefreshFlag} to convert
    * @return an {@code AttributeValue} representing the enum as a string
    */
	 @Override
	    public AttributeValue transformFrom(ESearchPmid.RetrievalRefreshFlag input) {
	        return AttributeValue.builder().s(input.name()).build();
	    }

	 /**
	     * Converts a DynamoDB {@link AttributeValue} (of type String)
	     * to a {@link RetrievalRefreshFlag} enum.
	     *
	     * @param attributeValue the {@code AttributeValue} to convert
	     * @return the corresponding {@code RetrievalRefreshFlag} enum value
	     */
	 @Override
	    public ESearchPmid.RetrievalRefreshFlag transformTo(AttributeValue attributeValue) {
	        return ESearchPmid.RetrievalRefreshFlag.valueOf(attributeValue.s());
	    }

	 /**
	     * Specifies the type handled by this converter.
	     *
	     * @return the {@link EnhancedType} for {@code RetrievalRefreshFlag}
	     */
	 @Override
	    public EnhancedType<RetrievalRefreshFlag> type() {
	        return EnhancedType.of(RetrievalRefreshFlag.class);
	    }

	 /**
	     * Declares the underlying DynamoDB attribute type used (String).
	     *
	     * @return {@link AttributeValueType#S}
	     */
	    @Override
	    public AttributeValueType attributeValueType() {
	        return AttributeValueType.S;
	    }

}
