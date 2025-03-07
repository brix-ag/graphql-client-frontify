package ch.brix.gql.client.frontify.enums;

/**
 * Different `Project` types
 */
public enum ProjectType {
  @com.google.gson.annotations.SerializedName("DOCUMENT_LIBRARY") 
  DOCUMENT_LIBRARY,
  @com.google.gson.annotations.SerializedName("ICON_LIBRARY") 
  ICON_LIBRARY,
  @com.google.gson.annotations.SerializedName("LOGO_LIBRARY") 
  LOGO_LIBRARY,
  @com.google.gson.annotations.SerializedName("MEDIA_LIBRARY") 
  MEDIA_LIBRARY,
  @com.google.gson.annotations.SerializedName("WORKSPACE") 
  WORKSPACE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
