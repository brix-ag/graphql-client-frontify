package ch.brix.gql.client.frontify.enums;

public enum AssetOrientation {
  @com.google.gson.annotations.SerializedName("LANDSCAPE") 
  LANDSCAPE,
  @com.google.gson.annotations.SerializedName("PORTRAIT") 
  PORTRAIT,
  @com.google.gson.annotations.SerializedName("SQUARE") 
  SQUARE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
