package reciter.database.dynamodb.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbAttribute;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbSortKey;

/**
 * A publication manually added from a non-PubMed source (Scopus, Web of Science,
 * OpenAlex). External articles never enter feature generation, scoring, or
 * Analysis writes; they are appended to feature-generator API output at
 * serialization time when includeExternal=true is requested.
 * 
 * <p>Prefer the no-arg constructor + setters over the generated all-args
 * constructor: several fields are adjacent, same-typed Strings (e.g.
 * {@code addedBy}/{@code dateAdded}/{@code method}), so a positional call
 * gives the compiler nothing to catch a transposed argument
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
public class ExternalArticle {

    /**
     * The unique identifier of the person.
     * Acts as the partition key in DynamoDB.
     */
    private String uid;

    /**
     * Prefixed canonical identifier, e.g. "SCOPUS:85123456789",
     * "OPENALEX:W2741809807", "WOS:000123456700001".
     * Acts as the sort key in DynamoDB.
     */
    private String articleId;

    private String doi;

    /** Present only when the source record carries a PMID (should normally be blocked at add time). */
    private Long pmid;

    private String title;
    private String journalOrVenue;
    private List<String> authors;

    /** Publication date as provided by the source, ideally ISO-8601 (yyyy or yyyy-MM-dd). */
    private String pubDate;

    private String publicationType;

    /** SCOPUS | WOS | OPENALEX — must agree with the articleId prefix. */
    private String sourceType;

    private String addedBy;

    /** ISO-8601 instant, set server-side at add time. */
    private String dateAdded;

    /** dropdown-search | scopus-authorships-tab */
    private String method;

    /** True once superseded by a PubMed record with the same DOI; excluded from API merge. */
    private Boolean suppressed;

    private Long supersededByPmid;

    /** Raw source API record as a JSON string, for provenance/debugging. */
    private String rawRecord;

    @DynamoDbPartitionKey
    @DynamoDbAttribute("uid")
    public String getUid() {
        return uid;
    }

    @DynamoDbSortKey
    @DynamoDbAttribute("articleId")
    public String getArticleId() {
        return articleId;
    }
}