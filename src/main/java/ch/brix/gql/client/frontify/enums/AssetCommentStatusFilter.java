package ch.brix.gql.client.frontify.enums;

/**
 * Defines how the `AssetComment` list should be filtered.
 */
public enum AssetCommentStatusFilter {
  @com.google.gson.annotations.SerializedName("OPEN") 
  OPEN,
  @com.google.gson.annotations.SerializedName("RESOLVED") 
  RESOLVED,
  @com.google.gson.annotations.SerializedName("ALL") 
  ALL;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
