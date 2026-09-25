package ch.brix.gql.client.frontify.enums;

/**
 * How close a hit must be to the search term before it is worth returning.
 */
public enum SearchRelevance {
  /**
   * The floor guideline search has always used, tuned for someone typing into the search box, where an<br>unrelated hit is more costly than a missing one. The default for every query that does not say<br>otherwise, so existing callers keep the behaviour they had.
   */
  @com.google.gson.annotations.SerializedName("DEFAULT") 
  DEFAULT,
  /**
   * A markedly lower floor -- roughly a tenth of {@see self::DEFAULT}. For callers that would rather sift<br>loosely related content than miss it, such as gathering a broad candidate set to rank or summarise<br>themselves. Expect noticeably more hits, and noticeably weaker ones.
   */
  @com.google.gson.annotations.SerializedName("LOW") 
  LOW;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
