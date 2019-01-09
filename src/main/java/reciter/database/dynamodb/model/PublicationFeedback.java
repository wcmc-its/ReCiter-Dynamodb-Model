package reciter.database.dynamodb.model;

public enum PublicationFeedback {
	ACCEPTED, // This publication is in the gold standard
	REJECTED, // This publications was rejected 
	NULL // No action
}
