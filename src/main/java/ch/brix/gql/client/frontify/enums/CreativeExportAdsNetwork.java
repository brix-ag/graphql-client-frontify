package ch.brix.gql.client.frontify.enums;

/**
 * Specifies the ad network, affecting the structure of the exported HTML.
 */
public enum CreativeExportAdsNetwork {
  @com.google.gson.annotations.SerializedName("GOOGLE") 
  GOOGLE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
