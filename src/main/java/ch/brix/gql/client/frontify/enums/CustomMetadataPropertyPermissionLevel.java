package ch.brix.gql.client.frontify.enums;

/**
 * Permission levels allowed for a custom metadata property.
 */
public enum CustomMetadataPropertyPermissionLevel {
  /**
   * Allows updating and deleting `CustomMetadataProperty` items
   */
  @com.google.gson.annotations.SerializedName("ADMIN") 
  ADMIN,
  /**
   * Allows assigning, updating or removing `CustomMetadataProperty` values.
   */
  @com.google.gson.annotations.SerializedName("EDIT") 
  EDIT,
  /**
   * Allows viewing the custom metadata property and its custom metadata values.
   */
  @com.google.gson.annotations.SerializedName("VIEW") 
  VIEW;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
