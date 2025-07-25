package reciter.database.dynamodb.model;

import software.amazon.awssdk.enhanced.dynamodb.AttributeConverter;
import software.amazon.awssdk.enhanced.dynamodb.AttributeValueType;
import software.amazon.awssdk.enhanced.dynamodb.EnhancedType;
import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

/**
 * A custom implementation of {@link AttributeConverter} that handles the conversion
 * between {@link GenderEnum} and DynamoDB's {@link AttributeValue}.
 */

public class GenderTypeConverter implements AttributeConverter<GenderEnum> {

	/**
     * Converts the {@link GenderEnum} to a DynamoDB {@link AttributeValue} (String type).
     *
     * @param input the GenderEnum value to convert.
     * @return an AttributeValue containing the enum name.
     */
    @Override
    public AttributeValue transformFrom(GenderEnum input) {
        return AttributeValue.builder().s(input.name()).build();
    }

    /**
     * Converts a DynamoDB {@link AttributeValue} to a {@link GenderEnum}.
     *
     * @param attributeValue the attribute value from DynamoDB.
     * @return the GenderEnum represented by the string.
     * @throws IllegalArgumentException if the string does not match any enum constant.
     */
    @Override
    public GenderEnum transformTo(AttributeValue attributeValue) {
        return GenderEnum.valueOf(attributeValue.s());
    }

    /**
     * Specifies the type this converter handles: {@link GenderEnum}.
     *
     * @return the enhanced type representation of GenderEnum.
     */
    @Override
    public EnhancedType<GenderEnum> type() {
        return EnhancedType.of(GenderEnum.class);
    }

    /**
     * Specifies the underlying DynamoDB type this converter uses (String).
     *
     * @return {@link AttributeValueType#S} for string type.
     */
    @Override
    public AttributeValueType attributeValueType() {
        return AttributeValueType.S;
    }
}