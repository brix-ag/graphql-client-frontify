package ch.brix.gql.client.frontify.enums;

/**
 * Condition types. A Condition defines which field value of the `Asset` is compared against a given value.<br>We currently support 4 different kinds of Conditions on `Assets`:<br>- **TAG**: Refers to a tag of the `Asset`.<br>- **METADATA_VALUE**: Refers to a value of a custom `MetadataField` of an `Asset`.<br>- **CUSTOM_METADATA_VALUE**: Refers to a value of a `CustomMetadata` of an `Asset`.<br>- **EXTERNAL_ID**: Refers to the `externalId` assigned to the `Asset`.<br>- **FILE_EXTENSION**: Refers to the file extension of an `Asset`.
 */
public enum ConditionType {
  @com.google.gson.annotations.SerializedName("METADATA_VALUE") 
  METADATA_VALUE,
  @com.google.gson.annotations.SerializedName("CUSTOM_METADATA_VALUE") 
  CUSTOM_METADATA_VALUE,
  @com.google.gson.annotations.SerializedName("EXTERNAL_ID") 
  EXTERNAL_ID,
  @com.google.gson.annotations.SerializedName("TAG") 
  TAG,
  @com.google.gson.annotations.SerializedName("FILE_EXTENSION") 
  FILE_EXTENSION;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
