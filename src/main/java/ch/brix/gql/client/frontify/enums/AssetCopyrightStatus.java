package ch.brix.gql.client.frontify.enums;

public enum AssetCopyrightStatus {
  @com.google.gson.annotations.SerializedName("COPYRIGHTED") 
  COPYRIGHTED,
  @com.google.gson.annotations.SerializedName("PUBLIC") 
  PUBLIC,
  @com.google.gson.annotations.SerializedName("UNKNOWN") 
  UNKNOWN;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
