package ch.brix.gql.client.frontify.enums;

public enum ServiceAppStatus {
  @com.google.gson.annotations.SerializedName("ENABLED") 
  ENABLED,
  @com.google.gson.annotations.SerializedName("DISABLED") 
  DISABLED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
