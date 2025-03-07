package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `Project` permission levels.
 */
public enum ProjectPermission {
  @com.google.gson.annotations.SerializedName("EDIT") 
  EDIT,
  @com.google.gson.annotations.SerializedName("COMMENT") 
  COMMENT,
  @com.google.gson.annotations.SerializedName("VIEW") 
  VIEW,
  @com.google.gson.annotations.SerializedName("ADMIN") 
  ADMIN,
  @com.google.gson.annotations.SerializedName("TRANSLATE") 
  TRANSLATE;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
