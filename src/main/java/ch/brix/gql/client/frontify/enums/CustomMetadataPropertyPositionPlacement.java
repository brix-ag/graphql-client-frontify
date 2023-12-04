package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CustomMetadataProperty` position placement options.
 */
public enum CustomMetadataPropertyPositionPlacement {
  @com.google.gson.annotations.SerializedName("FIRST") 
  FIRST,
  @com.google.gson.annotations.SerializedName("LAST") 
  LAST,
  @com.google.gson.annotations.SerializedName("BEFORE") 
  BEFORE,
  @com.google.gson.annotations.SerializedName("AFTER") 
  AFTER;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
