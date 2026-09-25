package ch.brix.gql.client.frontify.enums;

/**
 * List of possible `CreativeTemplate` modes.
 */
public enum CreativeTemplateMode {
  /**
   * Represents a static template.
   */
  @com.google.gson.annotations.SerializedName("STATIC") 
  STATIC,
  /**
   * Represents a motion template.
   */
  @com.google.gson.annotations.SerializedName("MOTION") 
  MOTION;
  @java.lang.Override
  public java.lang.String toString() {
    com.google.gson.annotations.SerializedName sn = this.getClass().getDeclaredAnnotation(com.google.gson.annotations.SerializedName.class);
    if (sn == null)
      return name();
    return sn.value();
  }
}
