package reciter.database.dynamodb.model;

/**
* Represents the feedback status of a publication in the context of identity
 * @author ved4006
 */
public enum PublicationFeedback {
	/**
     * This publication has been accepted by the reviewer as relevant (i.e., part of the gold standard).
     */
	ACCEPTED, 
	/**
     * This publication has been explicitly rejected.
     */
	REJECTED, 
	/**
     *No action.
     */
	NULL 
}
