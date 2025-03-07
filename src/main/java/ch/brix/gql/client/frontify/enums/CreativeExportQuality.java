package ch.brix.gql.client.frontify.enums;

/**
 * Compression level, affecting quality and filesize of the exported Creative.
 */
public enum CreativeExportQuality {
  @com.google.gson.annotations.SerializedName("MAXIMUM") 
  MAXIMUM,
  @com.google.gson.annotations.SerializedName("HIGH") 
  HIGH,
  @com.google.gson.annotations.SerializedName("MEDIUM") 
  MEDIUM,
  @com.google.gson.annotations.SerializedName("LOW") 
  LOW;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
