package ch.brix.gql.client.frontify.enums;

/**
 * Query sorting option. Defines how the search results should be sorted.
 */
public enum WorkspaceProjectQuerySort {
  /**
   * Sorts the results by the newest entry.
   */
  @com.google.gson.annotations.SerializedName("NEWEST") 
  NEWEST,
  /**
   * Sorts the results by the oldest entry`.
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
