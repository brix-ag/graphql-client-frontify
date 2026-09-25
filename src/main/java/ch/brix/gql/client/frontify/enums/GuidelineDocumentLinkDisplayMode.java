package ch.brix.gql.client.frontify.enums;

public enum GuidelineDocumentLinkDisplayMode {
  @com.google.gson.annotations.SerializedName("ICON") 
  ICON,
  @com.google.gson.annotations.SerializedName("TEXT") 
  TEXT,
  @com.google.gson.annotations.SerializedName("ICON_TEXT") 
  ICON_TEXT;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
