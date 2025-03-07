package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `Library` types.
 */
public enum LibraryType {
  @com.google.gson.annotations.SerializedName("ICON_LIBRARY") 
  ICON_LIBRARY,
  @com.google.gson.annotations.SerializedName("MEDIA_LIBRARY") 
  MEDIA_LIBRARY,
  @com.google.gson.annotations.SerializedName("LOGO_LIBRARY") 
  LOGO_LIBRARY,
  @com.google.gson.annotations.SerializedName("DOCUMENT_LIBRARY") 
  DOCUMENT_LIBRARY;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
