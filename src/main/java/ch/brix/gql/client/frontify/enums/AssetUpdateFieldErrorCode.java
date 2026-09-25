package ch.brix.gql.client.frontify.enums;

public enum AssetUpdateFieldErrorCode {
  /**
   * The caller lacks the permission this field's operation requires.
   */
  @com.google.gson.annotations.SerializedName("PERMISSION_DENIED") 
  PERMISSION_DENIED,
  /**
   * The provided value is not valid for this field.
   */
  @com.google.gson.annotations.SerializedName("INVALID_VALUE") 
  INVALID_VALUE,
  /**
   * The referenced `WorkflowStatus` does not exist in the `Library`'s workflow.
   */
  @com.google.gson.annotations.SerializedName("STATUS_NOT_FOUND") 
  STATUS_NOT_FOUND,
  /**
   * The referenced custom metadata property does not exist in the `Library`.
   */
  @com.google.gson.annotations.SerializedName("PROPERTY_NOT_FOUND") 
  PROPERTY_NOT_FOUND,
  /**
   * The referenced `License` does not exist in the `Library`.
   */
  @com.google.gson.annotations.SerializedName("LICENSE_NOT_FOUND") 
  LICENSE_NOT_FOUND,
  /**
   * The referenced `Collection` does not exist, or is not accessible to the caller.
   */
  @com.google.gson.annotations.SerializedName("COLLECTION_NOT_FOUND") 
  COLLECTION_NOT_FOUND,
  /**
   * The referenced `Collection` exists but is not curated (project-level).
   */
  @com.google.gson.annotations.SerializedName("COLLECTION_NOT_CURATED") 
  COLLECTION_NOT_CURATED;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
