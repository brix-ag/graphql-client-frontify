package ch.brix.gql.client.frontify.enums;

public enum AssetUpdateFailureCode {
  /**
   * The `Asset` does not exist, or is not accessible to the caller.
   */
  @com.google.gson.annotations.SerializedName("ASSET_NOT_FOUND") 
  ASSET_NOT_FOUND,
  /**
   * The caller can view the `Asset` but lacks edit permission.
   */
  @com.google.gson.annotations.SerializedName("ASSET_NOT_EDITABLE") 
  ASSET_NOT_EDITABLE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
