package ch.brix.gql.client.frontify.enums;

public enum AssetProvenanceCertStatus {
  /**
   * The credential's signature validated against a signer on the trust list.
   */
  @com.google.gson.annotations.SerializedName("TRUSTED") 
  TRUSTED,
  /**
   * The file's content or claim hash binding failed validation - the file was altered after signing.
   */
  @com.google.gson.annotations.SerializedName("TAMPERED") 
  TAMPERED,
  /**
   * The signature is self-consistent but trust could not be confirmed: an unrecognized signer, or a certificate that aged out without a trusted timestamp.
   */
  @com.google.gson.annotations.SerializedName("NOT_TRUSTED") 
  NOT_TRUSTED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
