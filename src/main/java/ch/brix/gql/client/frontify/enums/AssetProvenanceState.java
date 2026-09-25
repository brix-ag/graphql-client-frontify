package ch.brix.gql.client.frontify.enums;

public enum AssetProvenanceState {
  /**
   * An embedded credential was found and read.
   */
  @com.google.gson.annotations.SerializedName("DETECTED") 
  DETECTED,
  /**
   * The file was examined and carries no embedded credential.
   */
  @com.google.gson.annotations.SerializedName("NO_CREDENTIAL") 
  NO_CREDENTIAL,
  /**
   * Extraction could not complete, so nothing was established about the file either way.
   */
  @com.google.gson.annotations.SerializedName("FAILED") 
  FAILED,
  /**
   * Extraction has been requested and has not finished yet.
   */
  @com.google.gson.annotations.SerializedName("PROCESSING") 
  PROCESSING,
  /**
   * The file does not support content credentials.
   */
  @com.google.gson.annotations.SerializedName("UNSUPPORTED") 
  UNSUPPORTED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
