package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `Asset` status types.
 */
public enum AssetStatusType {
  @com.google.gson.annotations.SerializedName("FINISHED") 
  FINISHED,
  @com.google.gson.annotations.SerializedName("PROCESSING") 
  PROCESSING,
  @com.google.gson.annotations.SerializedName("PROCESSING_FAILED") 
  PROCESSING_FAILED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
