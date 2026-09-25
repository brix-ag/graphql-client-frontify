package ch.brix.gql.client.frontify.enums;

/**
 * Subjects defined for basic custom metadata property permissions.
 */
public enum CustomMetadataPropertyBasicPermissionSubject {
  /**
   * Everyone.
   */
  @com.google.gson.annotations.SerializedName("EVERYONE") 
  EVERYONE,
  /**
   * Only authenticated users.
   */
  @com.google.gson.annotations.SerializedName("INTERNAL") 
  INTERNAL,
  /**
   * Those with `edit` permissions in the scope where the property is defined.
   */
  @com.google.gson.annotations.SerializedName("EDITOR") 
  EDITOR,
  /**
   * Those with folder-level `edit` permissions in the project where the property is defined.
   */
  @com.google.gson.annotations.SerializedName("CONTENT_EDITOR") 
  CONTENT_EDITOR,
  /**
   * Those with `admin` permissions in the scope where the property is defined.
   */
  @com.google.gson.annotations.SerializedName("ADMIN") 
  ADMIN;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
