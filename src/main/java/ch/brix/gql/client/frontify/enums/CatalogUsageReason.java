package ch.brix.gql.client.frontify.enums;

public enum CatalogUsageReason {
  @com.google.gson.annotations.SerializedName("USED_BY_METADATA_PROPERTY") 
  USED_BY_METADATA_PROPERTY,
  @com.google.gson.annotations.SerializedName("LINKED_BY_OTHER_CATALOG") 
  LINKED_BY_OTHER_CATALOG;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
