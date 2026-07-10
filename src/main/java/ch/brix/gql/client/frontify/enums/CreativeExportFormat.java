package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CreativeExportOptionsInput` formats.
 */
public enum CreativeExportFormat {
  @com.google.gson.annotations.SerializedName("PNG") 
  PNG,
  @com.google.gson.annotations.SerializedName("JPG") 
  JPG,
  @com.google.gson.annotations.SerializedName("PDF") 
  PDF,
  @com.google.gson.annotations.SerializedName("MP4") 
  MP4,
  @com.google.gson.annotations.SerializedName("GIF") 
  GIF,
  @com.google.gson.annotations.SerializedName("HTML") 
  HTML;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
