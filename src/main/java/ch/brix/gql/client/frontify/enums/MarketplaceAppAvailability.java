package ch.brix.gql.client.frontify.enums;

/**
 * Whether the marketplace app is available publicly or privately.
 */
public enum MarketplaceAppAvailability {
  /**
   * Private Availability
   */
  @com.google.gson.annotations.SerializedName("PRIVATE") 
  PRIVATE,
  /**
   * Community Availability
   */
  @com.google.gson.annotations.SerializedName("COMMUNITY") 
  COMMUNITY;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
