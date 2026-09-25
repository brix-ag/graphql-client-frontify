package ch.brix.gql.client.frontify.enums;

/**
 * Search sorting option. Defines how the search results should be sorted.
 */
public enum AccountQuerySortByInput {
  /**
   * Sort the results by relevance.
   */
  @com.google.gson.annotations.SerializedName("RELEVANCE") 
  RELEVANCE,
  /**
   * Sort the results by newest.
   */
  @com.google.gson.annotations.SerializedName("NEWEST") 
  NEWEST,
  /**
   * Sort the results by oldest.
   */
  @com.google.gson.annotations.SerializedName("OLDEST") 
  OLDEST;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
