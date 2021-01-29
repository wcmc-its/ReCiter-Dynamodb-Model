package reciter.database.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTyped;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperFieldModel.DynamoDBAttributeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBDocument
public class ESearchPmid {
    private List<Long> pmids;
    private String retrievalStrategyName;
    private Date retrievalDate;
    @DynamoDBTyped(DynamoDBAttributeType.S)
    private RetrievalRefreshFlag lookupType;


    /**
     * User would be able to select one of the refresh flag for retrieval.
     * If "ALL_PUBLICATIONS" - re-import all publications from all sources
     * If "ONLY_NEWLY_ADDED_PUBLICATIONS" - add publications with a date range. Ideally last time it was run to future.
     * If "FALSE" (default) - retrieve existing records from eSearchResults
     * 
     * @author Sarbajit Dutta (szd2013) 
     */
    public enum RetrievalRefreshFlag {
        ALL_PUBLICATIONS,
        ONLY_NEWLY_ADDED_PUBLICATIONS,
        FALSE
    }
}
