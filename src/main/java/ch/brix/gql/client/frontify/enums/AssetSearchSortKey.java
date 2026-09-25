package ch.brix.gql.client.frontify.enums;

public enum AssetSearchSortKey {
  @com.google.gson.annotations.SerializedName("AVAILABLE_FROM") 
  AVAILABLE_FROM,
  @com.google.gson.annotations.SerializedName("AVAILABLE_UNTIL") 
  AVAILABLE_UNTIL,
  @com.google.gson.annotations.SerializedName("CREATED") 
  CREATED,
  @com.google.gson.annotations.SerializedName("FILE_CREATION_DATE") 
  FILE_CREATION_DATE,
  @com.google.gson.annotations.SerializedName("FILE_EXTENSION") 
  FILE_EXTENSION,
  @com.google.gson.annotations.SerializedName("LAST_MODIFIED") 
  LAST_MODIFIED,
  @com.google.gson.annotations.SerializedName("MANUAL") 
  MANUAL,
  @com.google.gson.annotations.SerializedName("RELEVANCE") 
  RELEVANCE,
  @com.google.gson.annotations.SerializedName("TITLE") 
  TITLE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
