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
 * {@code disputedBy}/{@code disputeResolvedBy}, {@code addedBy}), so a
 * positional call gives the compiler nothing to catch a transposed argument.
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

    /**
     * Current-cycle dispute snapshot (disputedBy/disputedAt/disputeNote/
     * disputeResolvedBy/disputeResolvedAt/disputeResolution below): a cheap,
     * denormalized view of the MOST RECENT dispute cycle only, for reads that
     * only care "is this row currently disputed, and how did that resolve" —
     * the faculty tab and the curator disputed-queue view, both filtering/
     * sorting on this constantly. It is legitimately overwritten by the next
     * DISPUTE, because {@link #disputeLog} below is the durable, append-only
     * record of every cycle; nothing here is the sole copy of anything.
     */
    private String disputedBy;

    /** ISO-8601 instant, set by DISPUTE. See {@link #disputedBy}. */
    private String disputedAt;

    /** Optional free-text note from the disputing faculty member, set by DISPUTE. */
    private String disputeNote;

    /** The uid that resolved the dispute (RETRACT or RESOLVE). See {@link #disputedBy}. */
    private String disputeResolvedBy;

    /** ISO-8601 instant, set on RETRACT or RESOLVE. */
    private String disputeResolvedAt;

    /** RETRACTED | CLEARED — which kind of resolution; distinguishes a faculty member
     *  undoing their own dispute from a curator adjudicating it closed. */
    private String disputeResolution;

    /**
     * Full, append-only dispute history — one entry per DISPUTE/RETRACT/RESOLVE
     * event, oldest first, nothing ever removed or edited. Same non-destructive
     * relationship to the flat dispute fields above that {@code GoldStandard}'s
     * own {@code auditLog} has to its current-state fields ({@code knownPmids}/
     * {@code rejectedPmids}): the flat fields are a cheap current-state read,
     * this is the record of how it got there. A row disputed more than once
     * only loses history in the flat fields (by design, see above) — never here.
     */
    private List<ExternalArticleDisputeLog> disputeLog;

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