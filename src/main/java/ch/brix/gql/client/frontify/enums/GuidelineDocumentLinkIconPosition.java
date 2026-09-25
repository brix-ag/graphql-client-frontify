package ch.brix.gql.client.frontify.enums;

public enum GuidelineDocumentLinkIconPosition {
  @com.google.gson.annotations.SerializedName("LEFT") 
  LEFT,
  @com.google.gson.annotations.SerializedName("RIGHT") 
  RIGHT;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
