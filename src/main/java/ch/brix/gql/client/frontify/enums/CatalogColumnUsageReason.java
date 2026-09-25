package ch.brix.gql.client.frontify.enums;

public enum CatalogColumnUsageReason {
  @com.google.gson.annotations.SerializedName("USED_AS_METADATA_DISPLAY_COLUMN") 
  USED_AS_METADATA_DISPLAY_COLUMN,
  @com.google.gson.annotations.SerializedName("USED_BY_EXTERNAL_REFERENCE") 
  USED_BY_EXTERNAL_REFERENCE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
