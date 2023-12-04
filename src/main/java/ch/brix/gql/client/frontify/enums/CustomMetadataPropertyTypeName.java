package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CustomMetadataProperty` type names.
 */
public enum CustomMetadataPropertyTypeName {
  @com.google.gson.annotations.SerializedName("SELECT") 
  SELECT,
  @com.google.gson.annotations.SerializedName("MULTISELECT") 
  MULTISELECT,
  @com.google.gson.annotations.SerializedName("TEXT") 
  TEXT,
  @com.google.gson.annotations.SerializedName("LONGTEXT") 
  LONGTEXT,
  @com.google.gson.annotations.SerializedName("DATE") 
  DATE,
  @com.google.gson.annotations.SerializedName("NUMBER") 
  NUMBER,
  @com.google.gson.annotations.SerializedName("URL") 
  URL;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
