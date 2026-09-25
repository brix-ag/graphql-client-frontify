package ch.brix.gql.client.frontify.enums;

public enum UpdateAssetsStatus {
  /**
   * Every requested change was applied.
   */
  @com.google.gson.annotations.SerializedName("SUCCEEDED") 
  SUCCEEDED,
  /**
   * Some requested changes were applied; others failed.
   */
  @com.google.gson.annotations.SerializedName("PARTIALLY_SUCCEEDED") 
  PARTIALLY_SUCCEEDED,
  /**
   * No requested change was applied.
   */
  @com.google.gson.annotations.SerializedName("FAILED") 
  FAILED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
