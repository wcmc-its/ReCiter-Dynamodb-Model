package reciter.database.dynamodb.model;

/**
 * One entry in an {@link ExternalArticleDisputeLog} — which of the three dispute
 * events happened. Distinct from {@link ExternalArticle#disputeResolution}
 * ({@code RETRACTED}/{@code CLEARED}), which describes the outcome of a
 * completed cycle; this describes the raw action, including the one that
 * opens a cycle.
 */
public enum ExternalArticleDisputeAction {
    /** A faculty member flagged the row as not theirs. */
    DISPUTE,
    /** The faculty member who filed the dispute undid it themselves. */
    RETRACT,
    /** A curator adjudicated the dispute closed. */
    RESOLVE
}
