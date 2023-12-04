package ch.brix.gql.client.frontify.enums;

/**
 * Search sorting option. Defines how the search results should be sorted.
 */
public enum AssetQueryFilterSortType {
  /**
   * Sorts the results by the relevance (query score).
   */
  @com.google.gson.annotations.SerializedName("RELEVANCE") 
  RELEVANCE,
  /**
   * Sorts the results by the newest `Assets`.
   */
  @com.google.gson.annotations.SerializedName("NEWEST") 
  NEWEST,
  /**
   * Sorts the results by the oldest `Assets`.
   */
  @com.google.gson.annotations.SerializedName("OLDEST") 
  OLDEST,
  /**
   * Sorts the results ascending by the title of the `Assets`.
   */
  @com.google.gson.annotations.SerializedName("TITLE_ASCENDING") 
  TITLE_ASCENDING,
  /**
   * sorts the results descending by the title of the `Assets`.
   */
  @com.google.gson.annotations.SerializedName("TITLE_DESCENDING") 
  TITLE_DESCENDING;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
