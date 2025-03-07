package ch.brix.gql.client.frontify.enums;

/**
 * List of possible custom `MetadataField` types.
 */
public enum MetadataFieldType {
  @com.google.gson.annotations.SerializedName("SELECT") 
  SELECT,
  @com.google.gson.annotations.SerializedName("TEXT") 
  TEXT,
  @com.google.gson.annotations.SerializedName("LONGTEXT") 
  LONGTEXT,
  @com.google.gson.annotations.SerializedName("DATE") 
  DATE,
  @com.google.gson.annotations.SerializedName("NUMBER") 
  NUMBER;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
