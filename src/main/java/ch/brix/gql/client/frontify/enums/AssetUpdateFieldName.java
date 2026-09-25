package ch.brix.gql.client.frontify.enums;

public enum AssetUpdateFieldName {
  @com.google.gson.annotations.SerializedName("TITLE") 
  TITLE,
  @com.google.gson.annotations.SerializedName("DESCRIPTION") 
  DESCRIPTION,
  @com.google.gson.annotations.SerializedName("ALTERNATIVE_TEXT") 
  ALTERNATIVE_TEXT,
  @com.google.gson.annotations.SerializedName("IS_DECORATIVE") 
  IS_DECORATIVE,
  @com.google.gson.annotations.SerializedName("AUTHOR") 
  AUTHOR,
  @com.google.gson.annotations.SerializedName("BEGINS_AT") 
  BEGINS_AT,
  @com.google.gson.annotations.SerializedName("EXPIRES_AT") 
  EXPIRES_AT,
  @com.google.gson.annotations.SerializedName("COPYRIGHT_STATUS") 
  COPYRIGHT_STATUS,
  @com.google.gson.annotations.SerializedName("COPYRIGHT_NOTICE") 
  COPYRIGHT_NOTICE,
  @com.google.gson.annotations.SerializedName("FILENAME") 
  FILENAME,
  @com.google.gson.annotations.SerializedName("WORKFLOW_STATUS") 
  WORKFLOW_STATUS,
  @com.google.gson.annotations.SerializedName("ADD_TAGS") 
  ADD_TAGS,
  @com.google.gson.annotations.SerializedName("REMOVE_TAGS") 
  REMOVE_TAGS,
  @com.google.gson.annotations.SerializedName("ADD_LICENSES") 
  ADD_LICENSES,
  @com.google.gson.annotations.SerializedName("CUSTOM_METADATA") 
  CUSTOM_METADATA,
  @com.google.gson.annotations.SerializedName("ADD_COLLECTIONS") 
  ADD_COLLECTIONS;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
