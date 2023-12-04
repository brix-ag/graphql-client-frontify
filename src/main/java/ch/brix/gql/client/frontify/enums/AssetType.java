package ch.brix.gql.client.frontify.enums;

/**
 * The type of an `asset`.
 */
public enum AssetType {
  @com.google.gson.annotations.SerializedName("AUDIO") 
  AUDIO,
  @com.google.gson.annotations.SerializedName("DOCUMENT") 
  DOCUMENT,
  @com.google.gson.annotations.SerializedName("FILE") 
  FILE,
  @com.google.gson.annotations.SerializedName("IMAGE") 
  IMAGE,
  @com.google.gson.annotations.SerializedName("VIDEO") 
  VIDEO;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
