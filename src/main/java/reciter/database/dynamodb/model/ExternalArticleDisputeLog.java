package reciter.database.dynamodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

/**
 * One immutable entry in {@link ExternalArticle#disputeLog}. Structurally the
 * same idea as {@code GoldStandardAuditLog} — a nested, non-table bean embedded
 * in a list attribute on the parent item — adapted for this domain: action
 * instead of accept/reject, a free-text note instead of a pmid list.
 *
 * <p>Not a top-level DynamoDB table item, so no partition/sort key.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ExternalArticleDisputeLog {

    /** The uid that performed this action. */
    private String uid;

    /**
     * ISO-8601 instant. String, not Instant, to match
     * {@link ExternalArticle}'s existing dispute-field timestamps — the PATCH
     * handler stamps one timestamp string and reuses it for both the flat
     * field and this entry, no conversion.
     */
    private String dateTime;

    /** Optional free-text note (e.g. the disputing faculty member's reason). */
    private String note;

    private ExternalArticleDisputeAction action;
}
