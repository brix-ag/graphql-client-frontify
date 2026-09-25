package ch.brix.gql.client.frontify.enums;

public enum AssetSearchSortDirection {
  @com.google.gson.annotations.SerializedName("ASCENDING") 
  ASCENDING,
  @com.google.gson.annotations.SerializedName("DESCENDING") 
  DESCENDING;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
