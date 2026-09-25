package ch.brix.gql.client.frontify.enums;

public enum AssetAvailabilityOption {
  @com.google.gson.annotations.SerializedName("NOT_YET_VALID") 
  NOT_YET_VALID,
  @com.google.gson.annotations.SerializedName("VALID") 
  VALID,
  @com.google.gson.annotations.SerializedName("EXPIRED") 
  EXPIRED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
